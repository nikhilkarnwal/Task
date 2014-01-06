
public class DefaultCode {
    private String comment,fun_name,class_name,return_type;
    public DefaultCode(String fun_nm,String class_nm,String return_tp)
    {
        comment="// Add your code here";
        fun_name=fun_nm;
        class_name=class_nm;
        return_type=return_tp;
    }
    public String generatecode_c(String arg_list){
        String ret;
        ret=return_type+" "+fun_name+"("+arg_list+")";
        ret+="{";
        ret+="\n\n";
        ret+="  "+comment;
        ret+="\n";
        ret+="}";
        return ret;
    }
    
    public String generatecode_cpp(String arg_list){
        String ret;
        ret=return_type+" "+fun_name+"("+arg_list+")";
        ret+="{";
        ret+="\n\n";
        ret+="  "+comment;
        ret+="\n";
        ret+="}";
        return ret;
    }
    
    public String generatecode_java(String arg_list){
        String ret;
        ret="public class "+class_name+"{\n";
        ret+="  public "+return_type+" "+fun_name+"("+arg_list+")";
        ret+="{";
        ret+="\n\n";
        ret+="  "+comment;
        ret+="\n";
        ret+="  }\n}";
        return ret;
    }
}
