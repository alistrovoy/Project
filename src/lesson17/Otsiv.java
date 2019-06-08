package lesson17;

import java.util.Date;

public class Otsiv {
    private int reiting;
    private String nameAuthor;
    private boolean trueRazmer;
    private boolean trueOpisanie;
    private boolean trueFoto;
    private String tema;
    private String otsiv;
    private Date dataPublikasii;

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reiting) {
        this.reiting = reiting;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public boolean isTrueRazmer() {
        return trueRazmer;
    }

    public void setTrueRazmer(boolean trueRazmer) {
        this.trueRazmer = trueRazmer;
    }

    public boolean isTrueOpisanie() {
        return trueOpisanie;
    }

    public void setTrueOpisanie(boolean trueOpisanie) {
        this.trueOpisanie = trueOpisanie;
    }

    public boolean isTrueFoto() {
        return trueFoto;
    }

    public void setTrueFoto(boolean trueFoto) {
        this.trueFoto = trueFoto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getOtsiv() {
        return otsiv;
    }

    public void setOtsiv(String otsiv) {
        this.otsiv = otsiv;
    }

    public Date getDataPublikasii() {
        return dataPublikasii;
    }

    public void setDataPublikasii(Date dataPublikasii) {
        this.dataPublikasii = dataPublikasii;
    }

    @Override
    public String toString() {
        return "Otsiv{" +
                "reiting=" + reiting +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", trueRazmer=" + trueRazmer +
                ", trueOpisanie=" + trueOpisanie +
                ", trueFoto=" + trueFoto +
                ", tema='" + tema + '\'' +
                ", otsiv='" + otsiv + '\'' +
                ", dataPublikasii=" + dataPublikasii +
                '}';
    }
}
