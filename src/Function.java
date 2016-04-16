import java.util.List;

/**
 * Created by Jefferson on 15/04/2016.
 */
public class Function {
    private String returnType;
    private List<Tuple> params;
    private PsycoderParser.Cmp_declarationContext context;

    private PsycoderParser.Return_declarationContext returnContext;

    public Function(String returnType, List<Tuple> params, PsycoderParser.Cmp_declarationContext context,
                    PsycoderParser.Return_declarationContext returnContext) {
        this.returnType = returnType;
        this.params = params;
        this.context = context;
        this.returnContext = returnContext;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<Tuple> getParams() {
        return params;
    }

    public PsycoderParser.Cmp_declarationContext getContext() {
        return context;
    }

    public PsycoderParser.Return_declarationContext getReturnContext() {
        return returnContext;
    }
}