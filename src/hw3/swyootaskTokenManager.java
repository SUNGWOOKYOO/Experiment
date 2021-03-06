/* Generated By:JavaCC: Do not edit this line. swyootaskTokenManager.java */
package hw3;
import java.util.*;
import java.io.*;
import schema.*;
import Tool.*;

/** Token Manager. */
public class swyootaskTokenManager implements swyootaskConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 3;
         return jjMoveNfa_0(6, 0);
      case 10:
         jjmatchedKind = 4;
         return jjMoveNfa_0(6, 0);
      case 13:
         jjmatchedKind = 2;
         return jjMoveNfa_0(6, 0);
      case 32:
         jjmatchedKind = 1;
         return jjMoveNfa_0(6, 0);
      case 39:
         jjmatchedKind = 20;
         return jjMoveNfa_0(6, 0);
      case 42:
         jjmatchedKind = 17;
         return jjMoveNfa_0(6, 0);
      case 43:
         jjmatchedKind = 5;
         return jjMoveNfa_0(6, 0);
      case 44:
         jjmatchedKind = 18;
         return jjMoveNfa_0(6, 0);
      case 45:
         jjmatchedKind = 6;
         return jjMoveNfa_0(6, 0);
      case 46:
         jjmatchedKind = 19;
         return jjMoveNfa_0(6, 0);
      case 47:
         jjmatchedKind = 7;
         return jjMoveNfa_0(6, 0);
      case 59:
         jjmatchedKind = 24;
         return jjMoveNfa_0(6, 0);
      default :
         return jjMoveNfa_0(6, 0);
   }
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 45;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                     jjCheckNAdd(27);
                  }
                  else if ((0x100002600L & l) != 0L)
                     jjCheckNAddStates(0, 5);
                  else if ((0x3000000000000000L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 1:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 8:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 13:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 19:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 32)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 15;
                  jjCheckNAdd(27);
                  break;
               case 28:
                  if ((0x3000000000000000L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 29:
                  if (curChar == 61)
                     jjCheckNAdd(30);
                  break;
               case 30:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(30);
                  break;
               case 31:
                  if (curChar == 61)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 32:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddStates(0, 5);
                  break;
               case 33:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddTwoStates(33, 37);
                  break;
               case 35:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 38:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddTwoStates(38, 41);
                  break;
               case 40:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddTwoStates(42, 43);
                  break;
               case 43:
                  if (curChar == 62)
                     kind = 21;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 22)
                        kind = 22;
                     jjCheckNAdd(44);
                  }
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  else if ((0x80000000800000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 0:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 3:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 4:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 7:
                  if ((0x200000002000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 9:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 10:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 14:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if ((0x10000000100L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if ((0x80000000800000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if ((0x200000002000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 20:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 22:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 34:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 36:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 37:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 39:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 41:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 44:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(44);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 45 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   33, 37, 38, 41, 42, 43, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\57", null, null, null, null, null, 
null, null, null, null, "\52", "\54", "\56", "\47", null, null, null, "\73", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1febfe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[45];
static private final int[] jjstateSet = new int[90];
static protected char curChar;
/** Constructor. */
public swyootaskTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public swyootaskTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 45; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
