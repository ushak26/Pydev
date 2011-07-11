// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

public final class Repr extends exprType {
    public exprType value;

    public Repr(exprType value) {
        this.value = value;
    }


    public Repr createCopy() {
        return createCopy(true);
    }
    public Repr createCopy(boolean copyComments) {
        Repr temp = new Repr(value!=null?(exprType)value.createCopy(copyComments):null);
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
        StringBuffer sb = new StringBuffer("Repr[");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitRepr(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null){
            value.accept(visitor);
        }
    }

}
