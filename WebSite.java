public class WebSite {
    private String nome;
    private String link;

    public WebSite (String nome, String link){
        this.nome = nome;
        this.link = link;
    }
    public String getNome (){
        return this.nome;
    }
    public String getLink (){
        return this.link;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setLink(String link){
        this.link = link;
    }

    @Override
    public String toString (){
        String s = " Lista de Links";
        return s + this.getNome() + this.getLink();

    }
}