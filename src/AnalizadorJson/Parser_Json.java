
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package AnalizadorJson;

import java_cup.runtime.*;
import Model.DoublyLinkedList;
import Model.Symbols;
import Model.Symbols_Json;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser_Json extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Parser_JsonSym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser_Json() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser_Json(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser_Json(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\004\000\002\004\004\000\002\004\003" +
    "\000\002\006\003\000\002\006\003\000\002\005\006\000" +
    "\002\005\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\020\000\004\006\005\001\002\000\004\002\022\001" +
    "\002\000\010\005\012\011\014\012\007\001\002\000\004" +
    "\002\000\001\002\000\014\004\ufffb\005\ufffb\007\ufffb\011" +
    "\ufffb\012\ufffb\001\002\000\010\005\021\011\014\012\007" +
    "\001\002\000\004\004\015\001\002\000\004\002\ufffe\001" +
    "\002\000\010\005\ufffc\011\ufffc\012\ufffc\001\002\000\014" +
    "\004\ufffa\005\ufffa\007\ufffa\011\ufffa\012\ufffa\001\002\000" +
    "\006\011\014\012\007\001\002\000\012\005\ufff8\007\017" +
    "\011\ufff8\012\ufff8\001\002\000\010\005\ufff9\011\ufff9\012" +
    "\ufff9\001\002\000\010\005\ufffd\011\ufffd\012\ufffd\001\002" +
    "\000\004\002\uffff\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\020\000\006\002\003\003\005\001\001\000\002\001" +
    "\001\000\010\004\007\005\012\006\010\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\005\017\006\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\015\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser_Json$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser_Json$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser_Json$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible
    public static DoublyLinkedList list_json;
    
    public void syntax_error(Symbol s){
        System.out.println("Error R de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error NR de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser_Json$actions {
  private final Parser_Json parser;

  /** Constructor */
  CUP$Parser_Json$actions(Parser_Json parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser_Json$do_action_part00000000(
    int                        CUP$Parser_Json$act_num,
    java_cup.runtime.lr_parser CUP$Parser_Json$parser,
    java.util.Stack            CUP$Parser_Json$stack,
    int                        CUP$Parser_Json$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser_Json$result;

      /* select the action based on the action number */
      switch (CUP$Parser_Json$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)).value;
		RESULT = start_val;
              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser_Json$parser.done_parsing();
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= Inicio 
            {
              Object RESULT =null;

              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Inicio ::= LLAVE_IZQ sentencias LLAVE_DER 
            {
              Object RESULT =null;

              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("Inicio",1, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-2)), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Inicio ::= LLAVE_IZQ LLAVE_DER 
            {
              Object RESULT =null;

              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("Inicio",1, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // sentencias ::= sentencias sentencia 
            {
              Object RESULT =null;

              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("sentencias",2, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // sentencias ::= sentencia 
            {
              Object RESULT =null;

              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("sentencias",2, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // datos ::= NOMBRE_DATO 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser_Json$stack.peek()).value;
		RESULT = a.replaceAll("\"", "");
              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("datos",4, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // datos ::= DECIMAL 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser_Json$stack.peek()).value;
		RESULT = a;
              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("datos",4, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // sentencia ::= datos DOSPUT datos COMA 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-1)).value;
		list_json.Insertar_Symbolo_Json(new Symbols_Json(a,b));
              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("sentencia",3, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-3)), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // sentencia ::= datos DOSPUT datos 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser_Json$stack.peek()).value;
		list_json.Insertar_Symbolo_Json(new Symbols_Json(a,b));
              CUP$Parser_Json$result = parser.getSymbolFactory().newSymbol("sentencia",3, ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.elementAt(CUP$Parser_Json$top-2)), ((java_cup.runtime.Symbol)CUP$Parser_Json$stack.peek()), RESULT);
            }
          return CUP$Parser_Json$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser_Json$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser_Json$do_action(
    int                        CUP$Parser_Json$act_num,
    java_cup.runtime.lr_parser CUP$Parser_Json$parser,
    java.util.Stack            CUP$Parser_Json$stack,
    int                        CUP$Parser_Json$top)
    throws java.lang.Exception
    {
              return CUP$Parser_Json$do_action_part00000000(
                               CUP$Parser_Json$act_num,
                               CUP$Parser_Json$parser,
                               CUP$Parser_Json$stack,
                               CUP$Parser_Json$top);
    }
}

}
