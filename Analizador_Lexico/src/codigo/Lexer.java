/* The following code was generated by JFlex 1.4.3 on 13/03/20 05:50 AM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 13/03/20 05:50 AM from the specification file
 * <tt>C:/Users/candelariasarahi/Documents/NetBeansProjects/Analizador_Lexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\37\2\0\1\3\22\0\1\36\4\0\1\53\2\0"+
    "\1\51\1\52\1\43\1\41\1\3\1\42\1\0\1\34\12\2\1\50"+
    "\1\0\1\45\1\40\1\44\1\35\1\0\3\1\1\25\1\1\1\14"+
    "\2\1\1\13\5\1\1\22\3\1\1\17\3\1\1\33\3\1\3\0"+
    "\1\47\1\1\1\0\1\6\1\23\1\30\1\12\1\10\1\24\1\21"+
    "\1\31\1\20\2\1\1\15\1\1\1\11\1\16\1\32\1\1\1\7"+
    "\1\4\1\5\1\26\1\1\1\27\3\1\1\0\1\46\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\10\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\1\1\15"+
    "\1\16\1\17\1\20\1\21\3\2\1\22\3\2\1\23"+
    "\1\24\1\2\1\25\1\0\1\26\1\27\2\0\1\2"+
    "\1\30\1\31\3\2\1\32\1\2\3\0\6\2\1\0"+
    "\1\3\1\0\1\33\1\34\3\2\1\35\1\4\1\36"+
    "\1\37\1\40\1\2\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\54\0\54"+
    "\0\54\0\u0268\0\54\0\54\0\54\0\u0294\0\54\0\54"+
    "\0\u02c0\0\54\0\54\0\u02ec\0\u0318\0\u0344\0\130\0\u0370"+
    "\0\u039c\0\u03c8\0\130\0\130\0\u03f4\0\u0420\0\u044c\0\54"+
    "\0\54\0\u0478\0\u04a4\0\u04d0\0\130\0\130\0\u04fc\0\u0528"+
    "\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688"+
    "\0\u06b4\0\u06e0\0\u070c\0\u0738\0\u0764\0\54\0\u0790\0\130"+
    "\0\130\0\u07bc\0\u07e8\0\u0814\0\130\0\u0840\0\54\0\130"+
    "\0\130\0\u086c\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\3\3\1\7\2\3"+
    "\1\10\1\11\2\3\1\12\2\3\1\13\2\3\1\14"+
    "\5\3\1\15\1\16\1\2\1\5\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\55\0\2\3\1\0\30\3\22\0\1\4"+
    "\54\0\1\5\32\0\1\5\16\0\2\3\1\0\1\3"+
    "\1\34\26\3\21\0\2\3\1\0\5\3\1\35\22\3"+
    "\21\0\2\3\1\0\5\3\1\36\12\3\1\37\7\3"+
    "\21\0\2\3\1\0\11\3\1\40\16\3\21\0\2\3"+
    "\1\0\1\3\1\41\21\3\1\42\4\3\21\0\2\3"+
    "\1\0\17\3\1\43\6\3\1\44\1\3\21\0\2\3"+
    "\1\0\4\3\1\45\23\3\21\0\2\3\1\0\25\3"+
    "\1\46\2\3\55\0\1\47\65\0\1\50\52\0\1\51"+
    "\47\0\1\52\1\0\1\53\10\0\2\3\1\0\2\3"+
    "\1\54\25\3\21\0\2\3\1\0\6\3\1\55\21\3"+
    "\21\0\2\3\1\0\1\3\1\56\26\3\21\0\2\3"+
    "\1\0\12\3\1\57\15\3\21\0\2\3\1\0\3\3"+
    "\1\60\24\3\21\0\2\3\1\0\14\3\1\61\13\3"+
    "\21\0\2\3\1\0\20\3\1\62\7\3\21\0\2\3"+
    "\1\0\14\3\1\63\13\3\56\0\1\64\17\0\1\65"+
    "\53\0\1\66\52\0\2\3\1\0\3\3\1\67\24\3"+
    "\21\0\2\3\1\0\2\3\1\70\25\3\21\0\2\3"+
    "\1\0\14\3\1\71\13\3\21\0\2\3\1\0\1\3"+
    "\1\72\26\3\21\0\2\3\1\0\2\3\1\73\25\3"+
    "\21\0\2\3\1\0\11\3\1\74\16\3\55\0\1\75"+
    "\20\0\1\65\47\0\1\76\3\0\1\66\42\0\1\77"+
    "\7\0\2\3\1\0\1\3\1\100\26\3\21\0\2\3"+
    "\1\0\1\3\1\101\26\3\21\0\2\3\1\0\5\3"+
    "\1\102\22\3\21\0\2\3\1\0\24\3\1\103\3\3"+
    "\21\0\2\3\1\0\22\3\1\104\5\3\21\0\2\3"+
    "\1\0\4\3\1\105\23\3\54\0\1\106\71\0\1\107"+
    "\2\0\2\3\1\0\15\3\1\110\12\3\21\0\2\3"+
    "\1\0\25\3\1\111\2\3\21\0\2\3\1\0\11\3"+
    "\1\112\16\3\20\0\37\106\1\0\14\106\1\0\2\3"+
    "\1\0\1\3\1\113\26\3\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2200];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\14\1\3\11\1\1\3\11\1\1\2\11"+
    "\1\1\2\11\13\1\1\0\2\11\2\0\10\1\3\0"+
    "\6\1\1\0\1\11\1\0\7\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 138) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 27: 
          { lexeme=yytext(); return Start;
          }
        case 34: break;
        case 3: 
          { lexeme=yytext(); return Number;
          }
        case 35: break;
        case 28: 
          { lexeme=yytext(); return Float;
          }
        case 36: break;
        case 2: 
          { lexeme=yytext(); return Identifier;
          }
        case 37: break;
        case 20: 
          { lexeme=yytext(); return Op;
          }
        case 38: break;
        case 24: 
          { lexeme=yytext(); return End;
          }
        case 39: break;
        case 7: 
          { lexeme=yytext(); return Equal;
          }
        case 40: break;
        case 9: 
          { lexeme=yytext(); return Subtraction;
          }
        case 41: break;
        case 8: 
          { lexeme=yytext(); return Sum;
          }
        case 42: break;
        case 10: 
          { lexeme=yytext(); return Multiplication;
          }
        case 43: break;
        case 30: 
          { lexeme=yytext();return Number;
          }
        case 44: break;
        case 25: 
          { lexeme=yytext(); return Int;
          }
        case 45: break;
        case 11: 
          { lexeme=yytext(); return GreaterThan;
          }
        case 46: break;
        case 17: 
          { lexeme=yytext(); return Init;
          }
        case 47: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 48: break;
        case 6: 
          { return Linea
          }
        case 49: break;
        case 19: 
          { lexeme=yytext(); return Ob;
          }
        case 50: break;
        case 18: 
          { lexeme=yytext(); return If;
          }
        case 51: break;
        case 22: 
          { lexeme=yytext(); return Negative;
          }
        case 52: break;
        case 14: 
          { lexeme=yytext(); return DoublePoint;
          }
        case 53: break;
        case 12: 
          { lexeme=yytext(); return LessThan;
          }
        case 54: break;
        case 13: 
          { lexeme=yytext(); return And;
          }
        case 55: break;
        case 32: 
          { lexeme=yytext(); return Switch;
          }
        case 56: break;
        case 16: 
          { lexeme=yytext(); return Parenthesis_C;
          }
        case 57: break;
        case 1: 
          { return ERROR;
          }
        case 58: break;
        case 26: 
          { lexeme=yytext(); return Def;
          }
        case 59: break;
        case 15: 
          { lexeme=yytext(); return Parenthesis_O;
          }
        case 60: break;
        case 4: 
          { /*Ignore*/
          }
        case 61: break;
        case 23: 
          { lexeme=yytext(); return Or;
          }
        case 62: break;
        case 29: 
          { lexeme=yytext(); return While;
          }
        case 63: break;
        case 21: 
          { lexeme=yytext(); return Wh;
          }
        case 64: break;
        case 33: 
          { lexeme=yytext(); return Default;
          }
        case 65: break;
        case 31: 
          { lexeme=yytext(); return String;
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
