package LeituraCSV;
public class Musica {
    private String nome_musica;
    private String nome_artista;
    private double numero_artistas;
    private double ano_lancado;
    private double mes_lancado;
    private double dia_lancado;
    private double spotify_numero_playlist;
    private double spotify_ranking;
    private double streams;
    private double apple_numero_playlist;
    private double apple_ranking;
    private double deezer_numero_playlist;
    private double deezer_ranking;
    private double shazam_ranking;
    private double bpm;
    private String key;
    private String mode;
    private double danceability;
    private double valence;
    private String energy;
    private String acousticness;
    private String instrumentalness;
    private String liveness;
    private String speechiness;

    
    public Musica() {
        
    }


    public Musica(String nome_musica, String nome_artista, double numero_artistas, double ano_lancado,
            double mes_lancado, double dia_lancado, double spotify_numero_playlist, double spotify_ranking,
            double streams, double apple_numero_playlist, double apple_ranking, double deezer_numero_playlist,
            double deezer_ranking, double shazam_ranking, double bpm, String key, String mode, double danceability,
            double valence, String energy, String acousticness, String instrumentalness, String liveness,
            String speechiness) {
        this.nome_musica = nome_musica;
        this.nome_artista = nome_artista;
        this.numero_artistas = numero_artistas;
        this.ano_lancado = ano_lancado;
        this.mes_lancado = mes_lancado;
        this.dia_lancado = dia_lancado;
        this.spotify_numero_playlist = spotify_numero_playlist;
        this.spotify_ranking = spotify_ranking;
        this.streams = streams;
        this.apple_numero_playlist = apple_numero_playlist;
        this.apple_ranking = apple_ranking;
        this.deezer_numero_playlist = deezer_numero_playlist;
        this.deezer_ranking = deezer_ranking;
        this.shazam_ranking = shazam_ranking;
        this.bpm = bpm;
        this.key = key;
        this.mode = mode;
        this.danceability = danceability;
        this.valence = valence;
        this.energy = energy;
        this.acousticness = acousticness;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.speechiness = speechiness;
    }


    public String getNome_musica() {
        return nome_musica;
    }


    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }


    public String getNome_artista() {
        return nome_artista;
    }


    public void setNome_artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }


    public double getNumero_artistas() {
        return numero_artistas;
    }


    public void setNumero_artistas(double numero_artistas) {
        this.numero_artistas = numero_artistas;
    }


    public double getAno_lancado() {
        return ano_lancado;
    }


    public void setAno_lancado(double ano_lancado) {
        this.ano_lancado = ano_lancado;
    }


    public double getMes_lancado() {
        return mes_lancado;
    }


    public void setMes_lancado(double mes_lancado) {
        this.mes_lancado = mes_lancado;
    }


    public double getDia_lancado() {
        return dia_lancado;
    }


    public void setDia_lancado(double dia_lancado) {
        this.dia_lancado = dia_lancado;
    }


    public double getSpotify_numero_playlist() {
        return spotify_numero_playlist;
    }


    public void setSpotify_numero_playlist(double spotify_numero_playlist) {
        this.spotify_numero_playlist = spotify_numero_playlist;
    }


    public double getSpotify_ranking() {
        return spotify_ranking;
    }


    public void setSpotify_ranking(double spotify_ranking) {
        this.spotify_ranking = spotify_ranking;
    }


    public double getStreams() {
        return streams;
    }


    public void setStreams(double streams) {
        this.streams = streams;
    }


    public double getApple_numero_playlist() {
        return apple_numero_playlist;
    }


    public void setApple_numero_playlist(double apple_numero_playlist) {
        this.apple_numero_playlist = apple_numero_playlist;
    }


    public double getApple_ranking() {
        return apple_ranking;
    }


    public void setApple_ranking(double apple_ranking) {
        this.apple_ranking = apple_ranking;
    }


    public double getDeezer_numero_playlist() {
        return deezer_numero_playlist;
    }


    public void setDeezer_numero_playlist(double deezer_numero_playlist) {
        this.deezer_numero_playlist = deezer_numero_playlist;
    }


    public double getDeezer_ranking() {
        return deezer_ranking;
    }


    public void setDeezer_ranking(double deezer_ranking) {
        this.deezer_ranking = deezer_ranking;
    }


    public double getShazam_ranking() {
        return shazam_ranking;
    }


    public void setShazam_ranking(double shazam_ranking) {
        this.shazam_ranking = shazam_ranking;
    }


    public double getBpm() {
        return bpm;
    }


    public void setBpm(double bpm) {
        this.bpm = bpm;
    }


    public String getKey() {
        return key;
    }


    public void setKey(String key) {
        this.key = key;
    }


    public String getMode() {
        return mode;
    }


    public void setMode(String mode) {
        this.mode = mode;
    }


    public double getDanceability() {
        return danceability;
    }


    public void setDanceability(double danceability) {
        this.danceability = danceability;
    }


    public double getValence() {
        return valence;
    }


    public void setValence(double valence) {
        this.valence = valence;
    }


    public String getEnergy() {
        return energy;
    }


    public void setEnergy(String energy) {
        this.energy = energy;
    }


    public String getAcousticness() {
        return acousticness;
    }


    public void setAcousticness(String acousticness) {
        this.acousticness = acousticness;
    }


    public String getInstrumentalness() {
        return instrumentalness;
    }


    public void setInstrumentalness(String instrumentalness) {
        this.instrumentalness = instrumentalness;
    }


    public String getLiveness() {
        return liveness;
    }


    public void setLiveness(String liveness) {
        this.liveness = liveness;
    }


    public String getSpeechiness() {
        return speechiness;
    }


    public void setSpeechiness(String speechiness) {
        this.speechiness = speechiness;
    }
    
    

}
