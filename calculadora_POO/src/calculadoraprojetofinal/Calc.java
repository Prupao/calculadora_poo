package calculadoraprojetofinal;
public abstract class Calc implements Operacoes {
    private double result;
    private float resp;
    private double a;
    private double b;
    private float c;
    private float d;

    public float getResp() {
        return resp;
    }

    public void setResp(float resp) {
        this.resp = resp;
    }
   
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

   
    public Calc(double a, double b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    
    public double Operacao(double a, double b) {
        this.setResult(a + b);
        return this.getResult();
    }

    public float Operacao(float a, float b) {
        this.setResp(a - b);
        return this.getResp();
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            setResult(a / b);
            return getResult();
        }
    }

    @Override
    public double multiplicar(double a, double b) {
        return 0;
    }

    @Override
    public double porcentagem(double a, double b) {
        return 0;
    }
    
}
