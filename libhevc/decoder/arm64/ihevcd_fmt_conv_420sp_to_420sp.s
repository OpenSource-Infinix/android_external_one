///*****************************************************************************
//*
//* Copyright (C) 2012 Ittiam Systems Pvt Ltd, Bangalore
//*
//* Licensed under the Apache License, Version 2.0 (the "License");
//* you may not use this file except in compliance with the License.
//* You may obtain a copy of the License at:
//*
//* http://www.apache.org/licenses/LICENSE-2.0
//*
//* Unless required by applicable law or agreed to in writing, software
//* distributed under the License is distributed on an "AS IS" BASIS,
//* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//* See the License for the specific language governing permissions and
//* limitations under the License.
//*
//*****************************************************************************/
///**
///*******************************************************************************
//* //file
//*  ihevcd_fmt_conv_420sp_to_420sp.s
//*
//* //brief
//*  contains function definitions for format conversions
//*
//* //author
//*  ittiam
//*
//* //par list of functions:
//*
//*
//* //remarks
//*  none
//*
//*******************************************************************************/
    .equ DO1STROUNDING, 0

    // ARM
    //
    // PRESERVE8

.text
.p2align 2

.include "ihevc_neon_macros.s"




///*****************************************************************************
//*                                                                            *
//*  Function Name    : ihevcd_fmt_conv_420sp_to_420sp()                       *
//*                                                                            *
//*  Description      : This function conversts the image from YUV420SP color  *
//*                     space to 420SP color space(UV interleaved).                 *
//*                                                                            *
//*  Arguments        : x0           pu1_y                                     *
//*                     x1           pu1_uv                                    *
//*                     x2           pu1_dest_y                                *
//*                     x3           pu1_dest_uv                               *
//*                     [x13 #40]    u2_width                                  *
//*                     [x13 #44]    u2_height                                 *
//*                     [x13 #48]    u2_stridey                                *
//*                     [x13 #52]    u2_stridechroma                           *
//*                     [x13 #56]    u2_dest_stridey                           *
//*                     [x13 #60]    u2_dest_stridechroma                      *
//*                                                                            *
//*  Values Returned  : None                                                   *
//*                                                                            *
//*  Register Usage   : x0 - x14                                               *
//*                                                                            *
//*  Stack Usage      : 40 Bytes                                               *
//*                                                                            *
//*  Interruptibility : Interruptible                                          *
//*                                                                            *
//*  Known Limitations                                                         *
//*       Assumptions: Image Width:     Assumed to be multiple of 2 and       *
//*                     Image Height:    Assumed to be even.                   *
//*                                                                            *
//*  Revision History :                                                        *
//*         DD MM YYYY   Author(s)       Changes (Describe the changes made)   *
//*         16 05 2012   Naveen SR     draft                                     *
//*                                                                            *
//*****************************************************************************/

    .global ihevcd_fmt_conv_420sp_to_420sp_av8
.type ihevcd_fmt_conv_420sp_to_420sp_a9q, %function
ihevcd_fmt_conv_420sp_to_420sp_av8:

    // STMFD sp!,{x4-x12, x14}
    push_v_regs
    stp         x19, x20,[sp,#-16]!

    mov         x8, x4                      ////Load u2_width
    mov         x9, x5                      ////Load u2_height

    LDR         w5, [sp,#80]                ////Load u2_dest_stridey
    sxtw        x5,w5

    mov         x7, x6                      ////Load u2_stridey

    SUB         x10,x7,x8                   //// Src Y increment
    SUB         x11,x5,x8                   //// Dst Y increment

    ///* Copy Y */

    MOV         x4,x9                       //// Copying height
y_row_loop:
    MOV         x6,x8                       //// Copying width

y_col_loop:
    prfm        PLDL1KEEP,[x0, #128]
    SUB         x6,x6,#32
    LD1         {v0.8b},[x0],#8
    LD1         {v1.8b},[x0],#8
    LD1         {v2.8b},[x0],#8
    LD1         {v3.8b},[x0],#8
    ST1         {v0.8b},[x2],#8
    ST1         {v1.8b},[x2],#8
    ST1         {v2.8b},[x2],#8
    ST1         {v3.8b},[x2],#8
    CMP         x6,#32
    BGE         y_col_loop
    CMP         x6,#0
    BEQ         y_col_loop_end
    ////If non-multiple of 16, then go back by few bytes to ensure 16 bytes can be read
    ////Ex if width is 162, above loop will process 160 pixels. And
    ////Both source and destination will point to 146th pixel and then 16 bytes will be read
    //// and written using VLD1 and VST1
    sub         x20,x6,#32
    neg         x6, x20
    SUB         x0,x0,x6
    SUB         x2,x2,x6
    LD1         {v0.8b},[x0],#8
    LD1         {v1.8b},[x0],#8
    LD1         {v2.8b},[x0],#8
    LD1         {v3.8b},[x0],#8
    ST1         {v0.8b},[x2],#8
    ST1         {v1.8b},[x2],#8
    ST1         {v2.8b},[x2],#8
    ST1         {v3.8b},[x2],#8

y_col_loop_end:
    ADD         x0, x0, x10
    ADD         x2, x2, x11
    SUBS        x4, x4, #1
    BGT         y_row_loop



    ///* Copy UV */

    LDR         w5, [sp,#88]                ////Load u2_dest_stridechroma
    sxtw        x5,w5

    LSR         x9, x9, #1                  //// height/2
//    MOV     x8,x8,LSR #1            @// Width/2

    MOV         x2,x3                       //pu1_dest_uv

    SUB         x10,x7,x8                   //// Src UV increment
    SUB         x11,x5,x8                   //// Dst UV increment

    MOV         x4,x9                       //// Copying height
uv_row_loop:
    MOV         x6,x8                       //// Copying width

uv_col_loop:

    prfm        PLDL1KEEP,[x1, #128]
    SUB         x6,x6,#16
    LD1         {v0.8b},[x1],#8
    LD1         {v1.8b},[x1],#8
    ST1         {v0.8b},[x2],#8
    ST1         {v1.8b},[x2],#8
    CMP         x6,#16
    BGE         uv_col_loop
    CMP         x6,#0
    BEQ         u_col_loop_end
    ////If non-multiple of 16, then go back by few bytes to ensure 16 bytes can be read
    ////Ex if width is 162, above loop will process 160 pixels. And
    ////Both source and destination will point to 146th pixel and then 16 bytes will be read
    //// and written using VLD1 and VST1
    sub         x20,x6,#16
    neg         x6, x20
    SUB         x1,x1,x6
    SUB         x2,x2,x6
    LD1         {v0.8b},[x1],#8
    LD1         {v1.8b},[x1],#8
    ST1         {v0.8b},[x2],#8
    ST1         {v1.8b},[x2],#8

u_col_loop_end:
    ADD         x1, x1, x10
    ADD         x2, x2, x11
    SUBS        x4, x4, #1
    BGT         uv_row_loop

exit:
    // LDMFD sp!,{x4-x12, pc}
    ldp         x19, x20,[sp],#16
    pop_v_regs
    ret


    .section .note.GNU-stack,"",%progbits

