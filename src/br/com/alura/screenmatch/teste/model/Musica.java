package br.com.alura.screenmatch.teste.model;

public class Musica extends Audio {
    String album;
    String cantor;
    String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
