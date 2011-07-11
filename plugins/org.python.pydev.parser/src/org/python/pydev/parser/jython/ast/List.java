// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

public final class List extends exprType implements expr_contextType {
    public exprType[] elts;
    public int ctx;

    public List(exprType[] elts, int ctx) {
        this.elts = elts;
        this.ctx = ctx;
    }


    public List createCopy() {
        return createCopy(true);
    }
    public List createCopy(boolean copyComments) {
        exprType[] new0;
        if(this.elts != null){
        new0 = new exprType[this.elts.length];
        for(int i=0;i<this.elts.length;i++){
            new0[i] = (exprType) (this.elts[i] != null? this.elts[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.elts;
        }
        List temp = new List(new0, ctx);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("List[");
        sb.append("elts=");
        sb.append(dumpThis(this.elts));
        sb.append(", ");
        sb.append("ctx=");
        sb.append(dumpThis(this.ctx, expr_contextType.expr_contextTypeNames));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitList(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elts != null) {
            for (int i = 0; i < elts.length; i++) {
                if (elts[i] != null){
                    elts[i].accept(visitor);
                }
            }
        }
    }

}
