/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.analysis;

import java.util.*;
import com.google.clearsilver.jsilver.syntax.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPCommand().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAMultipleCommand(AMultipleCommand node)
    {
        defaultIn(node);
    }

    public void outAMultipleCommand(AMultipleCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultipleCommand(AMultipleCommand node)
    {
        inAMultipleCommand(node);
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        outAMultipleCommand(node);
    }

    public void inACommentCommand(ACommentCommand node)
    {
        defaultIn(node);
    }

    public void outACommentCommand(ACommentCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommentCommand(ACommentCommand node)
    {
        inACommentCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getComment() != null)
        {
            node.getComment().apply(this);
        }
        outACommentCommand(node);
    }

    public void inADataCommand(ADataCommand node)
    {
        defaultIn(node);
    }

    public void outADataCommand(ADataCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADataCommand(ADataCommand node)
    {
        inADataCommand(node);
        if(node.getData() != null)
        {
            node.getData().apply(this);
        }
        outADataCommand(node);
    }

    public void inAVarCommand(AVarCommand node)
    {
        defaultIn(node);
    }

    public void outAVarCommand(AVarCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarCommand(AVarCommand node)
    {
        inAVarCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAVarCommand(node);
    }

    public void inALvarCommand(ALvarCommand node)
    {
        defaultIn(node);
    }

    public void outALvarCommand(ALvarCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALvarCommand(ALvarCommand node)
    {
        inALvarCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outALvarCommand(node);
    }

    public void inAEvarCommand(AEvarCommand node)
    {
        defaultIn(node);
    }

    public void outAEvarCommand(AEvarCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEvarCommand(AEvarCommand node)
    {
        inAEvarCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAEvarCommand(node);
    }

    public void inAUvarCommand(AUvarCommand node)
    {
        defaultIn(node);
    }

    public void outAUvarCommand(AUvarCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUvarCommand(AUvarCommand node)
    {
        inAUvarCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAUvarCommand(node);
    }

    public void inASetCommand(ASetCommand node)
    {
        defaultIn(node);
    }

    public void outASetCommand(ASetCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASetCommand(ASetCommand node)
    {
        inASetCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outASetCommand(node);
    }

    public void inANameCommand(ANameCommand node)
    {
        defaultIn(node);
    }

    public void outANameCommand(ANameCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANameCommand(ANameCommand node)
    {
        inANameCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        outANameCommand(node);
    }

    public void inAEscapeCommand(AEscapeCommand node)
    {
        defaultIn(node);
    }

    public void outAEscapeCommand(AEscapeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscapeCommand(AEscapeCommand node)
    {
        inAEscapeCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outAEscapeCommand(node);
    }

    public void inAAutoescapeCommand(AAutoescapeCommand node)
    {
        defaultIn(node);
    }

    public void outAAutoescapeCommand(AAutoescapeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAutoescapeCommand(AAutoescapeCommand node)
    {
        inAAutoescapeCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outAAutoescapeCommand(node);
    }

    public void inAWithCommand(AWithCommand node)
    {
        defaultIn(node);
    }

    public void outAWithCommand(AWithCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWithCommand(AWithCommand node)
    {
        inAWithCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outAWithCommand(node);
    }

    public void inALoopToCommand(ALoopToCommand node)
    {
        defaultIn(node);
    }

    public void outALoopToCommand(ALoopToCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALoopToCommand(ALoopToCommand node)
    {
        inALoopToCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outALoopToCommand(node);
    }

    public void inALoopCommand(ALoopCommand node)
    {
        defaultIn(node);
    }

    public void outALoopCommand(ALoopCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALoopCommand(ALoopCommand node)
    {
        inALoopCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getStart() != null)
        {
            node.getStart().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outALoopCommand(node);
    }

    public void inALoopIncCommand(ALoopIncCommand node)
    {
        defaultIn(node);
    }

    public void outALoopIncCommand(ALoopIncCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALoopIncCommand(ALoopIncCommand node)
    {
        inALoopIncCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getStart() != null)
        {
            node.getStart().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        if(node.getIncrement() != null)
        {
            node.getIncrement().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outALoopIncCommand(node);
    }

    public void inAEachCommand(AEachCommand node)
    {
        defaultIn(node);
    }

    public void outAEachCommand(AEachCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEachCommand(AEachCommand node)
    {
        inAEachCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outAEachCommand(node);
    }

    public void inADefCommand(ADefCommand node)
    {
        defaultIn(node);
    }

    public void outADefCommand(ADefCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefCommand(ADefCommand node)
    {
        inADefCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        {
            List<TWord> copy = new ArrayList<TWord>(node.getMacro());
            for(TWord e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVariable> copy = new ArrayList<PVariable>(node.getArguments());
            for(PVariable e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outADefCommand(node);
    }

    public void inACallCommand(ACallCommand node)
    {
        defaultIn(node);
    }

    public void outACallCommand(ACallCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACallCommand(ACallCommand node)
    {
        inACallCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        {
            List<TWord> copy = new ArrayList<TWord>(node.getMacro());
            for(TWord e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PExpression> copy = new ArrayList<PExpression>(node.getArguments());
            for(PExpression e : copy)
            {
                e.apply(this);
            }
        }
        outACallCommand(node);
    }

    public void inAIfCommand(AIfCommand node)
    {
        defaultIn(node);
    }

    public void outAIfCommand(AIfCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfCommand(AIfCommand node)
    {
        inAIfCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getBlock() != null)
        {
            node.getBlock().apply(this);
        }
        if(node.getOtherwise() != null)
        {
            node.getOtherwise().apply(this);
        }
        outAIfCommand(node);
    }

    public void inAAltCommand(AAltCommand node)
    {
        defaultIn(node);
    }

    public void outAAltCommand(AAltCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAltCommand(AAltCommand node)
    {
        inAAltCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outAAltCommand(node);
    }

    public void inAIncludeCommand(AIncludeCommand node)
    {
        defaultIn(node);
    }

    public void outAIncludeCommand(AIncludeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIncludeCommand(AIncludeCommand node)
    {
        inAIncludeCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAIncludeCommand(node);
    }

    public void inAHardIncludeCommand(AHardIncludeCommand node)
    {
        defaultIn(node);
    }

    public void outAHardIncludeCommand(AHardIncludeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHardIncludeCommand(AHardIncludeCommand node)
    {
        inAHardIncludeCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAHardIncludeCommand(node);
    }

    public void inALincludeCommand(ALincludeCommand node)
    {
        defaultIn(node);
    }

    public void outALincludeCommand(ALincludeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALincludeCommand(ALincludeCommand node)
    {
        inALincludeCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outALincludeCommand(node);
    }

    public void inAHardLincludeCommand(AHardLincludeCommand node)
    {
        defaultIn(node);
    }

    public void outAHardLincludeCommand(AHardLincludeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHardLincludeCommand(AHardLincludeCommand node)
    {
        inAHardLincludeCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAHardLincludeCommand(node);
    }

    public void inAContentTypeCommand(AContentTypeCommand node)
    {
        defaultIn(node);
    }

    public void outAContentTypeCommand(AContentTypeCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAContentTypeCommand(AContentTypeCommand node)
    {
        inAContentTypeCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAContentTypeCommand(node);
    }

    public void inAInlineCommand(AInlineCommand node)
    {
        defaultIn(node);
    }

    public void outAInlineCommand(AInlineCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInlineCommand(AInlineCommand node)
    {
        inAInlineCommand(node);
        if(node.getPosition() != null)
        {
            node.getPosition().apply(this);
        }
        if(node.getCommand() != null)
        {
            node.getCommand().apply(this);
        }
        outAInlineCommand(node);
    }

    public void inANoopCommand(ANoopCommand node)
    {
        defaultIn(node);
    }

    public void outANoopCommand(ANoopCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoopCommand(ANoopCommand node)
    {
        inANoopCommand(node);
        outANoopCommand(node);
    }

    public void inACsOpenPosition(ACsOpenPosition node)
    {
        defaultIn(node);
    }

    public void outACsOpenPosition(ACsOpenPosition node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACsOpenPosition(ACsOpenPosition node)
    {
        inACsOpenPosition(node);
        if(node.getCsOpen() != null)
        {
            node.getCsOpen().apply(this);
        }
        outACsOpenPosition(node);
    }

    public void inAStringExpression(AStringExpression node)
    {
        defaultIn(node);
    }

    public void outAStringExpression(AStringExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringExpression(AStringExpression node)
    {
        inAStringExpression(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAStringExpression(node);
    }

    public void inANumericExpression(ANumericExpression node)
    {
        defaultIn(node);
    }

    public void outANumericExpression(ANumericExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumericExpression(ANumericExpression node)
    {
        inANumericExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outANumericExpression(node);
    }

    public void inADecimalExpression(ADecimalExpression node)
    {
        defaultIn(node);
    }

    public void outADecimalExpression(ADecimalExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecimalExpression(ADecimalExpression node)
    {
        inADecimalExpression(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outADecimalExpression(node);
    }

    public void inAHexExpression(AHexExpression node)
    {
        defaultIn(node);
    }

    public void outAHexExpression(AHexExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHexExpression(AHexExpression node)
    {
        inAHexExpression(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAHexExpression(node);
    }

    public void inAVariableExpression(AVariableExpression node)
    {
        defaultIn(node);
    }

    public void outAVariableExpression(AVariableExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableExpression(AVariableExpression node)
    {
        inAVariableExpression(node);
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        outAVariableExpression(node);
    }

    public void inAFunctionExpression(AFunctionExpression node)
    {
        defaultIn(node);
    }

    public void outAFunctionExpression(AFunctionExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionExpression(AFunctionExpression node)
    {
        inAFunctionExpression(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        {
            List<PExpression> copy = new ArrayList<PExpression>(node.getArgs());
            for(PExpression e : copy)
            {
                e.apply(this);
            }
        }
        outAFunctionExpression(node);
    }

    public void inASequenceExpression(ASequenceExpression node)
    {
        defaultIn(node);
    }

    public void outASequenceExpression(ASequenceExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASequenceExpression(ASequenceExpression node)
    {
        inASequenceExpression(node);
        {
            List<PExpression> copy = new ArrayList<PExpression>(node.getArgs());
            for(PExpression e : copy)
            {
                e.apply(this);
            }
        }
        outASequenceExpression(node);
    }

    public void inANegativeExpression(ANegativeExpression node)
    {
        defaultIn(node);
    }

    public void outANegativeExpression(ANegativeExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegativeExpression(ANegativeExpression node)
    {
        inANegativeExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outANegativeExpression(node);
    }

    public void inANotExpression(ANotExpression node)
    {
        defaultIn(node);
    }

    public void outANotExpression(ANotExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpression(ANotExpression node)
    {
        inANotExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outANotExpression(node);
    }

    public void inAExistsExpression(AExistsExpression node)
    {
        defaultIn(node);
    }

    public void outAExistsExpression(AExistsExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExistsExpression(AExistsExpression node)
    {
        inAExistsExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAExistsExpression(node);
    }

    public void inACommaExpression(ACommaExpression node)
    {
        defaultIn(node);
    }

    public void outACommaExpression(ACommaExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommaExpression(ACommaExpression node)
    {
        inACommaExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outACommaExpression(node);
    }

    public void inAEqExpression(AEqExpression node)
    {
        defaultIn(node);
    }

    public void outAEqExpression(AEqExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqExpression(AEqExpression node)
    {
        inAEqExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEqExpression(node);
    }

    public void inANumericEqExpression(ANumericEqExpression node)
    {
        defaultIn(node);
    }

    public void outANumericEqExpression(ANumericEqExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumericEqExpression(ANumericEqExpression node)
    {
        inANumericEqExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outANumericEqExpression(node);
    }

    public void inANeExpression(ANeExpression node)
    {
        defaultIn(node);
    }

    public void outANeExpression(ANeExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANeExpression(ANeExpression node)
    {
        inANeExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outANeExpression(node);
    }

    public void inANumericNeExpression(ANumericNeExpression node)
    {
        defaultIn(node);
    }

    public void outANumericNeExpression(ANumericNeExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumericNeExpression(ANumericNeExpression node)
    {
        inANumericNeExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outANumericNeExpression(node);
    }

    public void inALtExpression(ALtExpression node)
    {
        defaultIn(node);
    }

    public void outALtExpression(ALtExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALtExpression(ALtExpression node)
    {
        inALtExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALtExpression(node);
    }

    public void inAGtExpression(AGtExpression node)
    {
        defaultIn(node);
    }

    public void outAGtExpression(AGtExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGtExpression(AGtExpression node)
    {
        inAGtExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGtExpression(node);
    }

    public void inALteExpression(ALteExpression node)
    {
        defaultIn(node);
    }

    public void outALteExpression(ALteExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALteExpression(ALteExpression node)
    {
        inALteExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALteExpression(node);
    }

    public void inAGteExpression(AGteExpression node)
    {
        defaultIn(node);
    }

    public void outAGteExpression(AGteExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGteExpression(AGteExpression node)
    {
        inAGteExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGteExpression(node);
    }

    public void inAAndExpression(AAndExpression node)
    {
        defaultIn(node);
    }

    public void outAAndExpression(AAndExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpression(AAndExpression node)
    {
        inAAndExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAndExpression(node);
    }

    public void inAOrExpression(AOrExpression node)
    {
        defaultIn(node);
    }

    public void outAOrExpression(AOrExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExpression(AOrExpression node)
    {
        inAOrExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAOrExpression(node);
    }

    public void inAAddExpression(AAddExpression node)
    {
        defaultIn(node);
    }

    public void outAAddExpression(AAddExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddExpression(AAddExpression node)
    {
        inAAddExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAAddExpression(node);
    }

    public void inANumericAddExpression(ANumericAddExpression node)
    {
        defaultIn(node);
    }

    public void outANumericAddExpression(ANumericAddExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumericAddExpression(ANumericAddExpression node)
    {
        inANumericAddExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outANumericAddExpression(node);
    }

    public void inASubtractExpression(ASubtractExpression node)
    {
        defaultIn(node);
    }

    public void outASubtractExpression(ASubtractExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubtractExpression(ASubtractExpression node)
    {
        inASubtractExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outASubtractExpression(node);
    }

    public void inAMultiplyExpression(AMultiplyExpression node)
    {
        defaultIn(node);
    }

    public void outAMultiplyExpression(AMultiplyExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplyExpression(AMultiplyExpression node)
    {
        inAMultiplyExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMultiplyExpression(node);
    }

    public void inADivideExpression(ADivideExpression node)
    {
        defaultIn(node);
    }

    public void outADivideExpression(ADivideExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivideExpression(ADivideExpression node)
    {
        inADivideExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivideExpression(node);
    }

    public void inAModuloExpression(AModuloExpression node)
    {
        defaultIn(node);
    }

    public void outAModuloExpression(AModuloExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModuloExpression(AModuloExpression node)
    {
        inAModuloExpression(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModuloExpression(node);
    }

    public void inANoopExpression(ANoopExpression node)
    {
        defaultIn(node);
    }

    public void outANoopExpression(ANoopExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoopExpression(ANoopExpression node)
    {
        inANoopExpression(node);
        outANoopExpression(node);
    }

    public void inANameVariable(ANameVariable node)
    {
        defaultIn(node);
    }

    public void outANameVariable(ANameVariable node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANameVariable(ANameVariable node)
    {
        inANameVariable(node);
        if(node.getWord() != null)
        {
            node.getWord().apply(this);
        }
        outANameVariable(node);
    }

    public void inADecNumberVariable(ADecNumberVariable node)
    {
        defaultIn(node);
    }

    public void outADecNumberVariable(ADecNumberVariable node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecNumberVariable(ADecNumberVariable node)
    {
        inADecNumberVariable(node);
        if(node.getDecNumber() != null)
        {
            node.getDecNumber().apply(this);
        }
        outADecNumberVariable(node);
    }

    public void inAHexNumberVariable(AHexNumberVariable node)
    {
        defaultIn(node);
    }

    public void outAHexNumberVariable(AHexNumberVariable node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHexNumberVariable(AHexNumberVariable node)
    {
        inAHexNumberVariable(node);
        if(node.getHexNumber() != null)
        {
            node.getHexNumber().apply(this);
        }
        outAHexNumberVariable(node);
    }

    public void inADescendVariable(ADescendVariable node)
    {
        defaultIn(node);
    }

    public void outADescendVariable(ADescendVariable node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADescendVariable(ADescendVariable node)
    {
        inADescendVariable(node);
        if(node.getParent() != null)
        {
            node.getParent().apply(this);
        }
        if(node.getChild() != null)
        {
            node.getChild().apply(this);
        }
        outADescendVariable(node);
    }

    public void inAExpandVariable(AExpandVariable node)
    {
        defaultIn(node);
    }

    public void outAExpandVariable(AExpandVariable node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpandVariable(AExpandVariable node)
    {
        inAExpandVariable(node);
        if(node.getParent() != null)
        {
            node.getParent().apply(this);
        }
        if(node.getChild() != null)
        {
            node.getChild().apply(this);
        }
        outAExpandVariable(node);
    }
}
