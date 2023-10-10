package LeituraCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LerArquivo {
  private static String nomeArquivo =  "./dados/spotify_2023.csv";

  public static ArrayList<Musica> ListarMusicas(){
    ArrayList<Musica> lista = new ArrayList<>();
    try {
      //Abrir Leitor
      BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
      String linha;
      boolean primeiraLinha = true;

      while( ( linha = leitor.readLine() ) != null){
        //ignora a primeira linha
        if(primeiraLinha){
          primeiraLinha = false;
          continue;
        }

        //dividir a linha em partes

        String[] partes = linha.split(",");
        String nome_musica = partes[0];
        String nome_artista;
        double numero_artistas;
        double ano_lancado;
        double mes_lancado;
        double dia_lancado;
        double spotify_numero_playlist;
        double spotify_ranking;
        double streams;
        double apple_numero_playlist;
        double apple_ranking;
        double deezer_numero_playlist;
        double deezer_ranking;
        double shazam_ranking;
        double bpm;
        String key;
        String mode;
        double danceability;
        double valence;
        String energy;
        String acousticness;
        String instrumentalness;
        String liveness;
        String speechiness;

        if(linha.contains("\"")){

          String[] separarArtistas = linha.split("\"");
          nome_artista = separarArtistas[1];
          String restoLinha = separarArtistas[2];
          partes = restoLinha.split(",");

          numero_artistas = Double.parseDouble(partes[0]);
          ano_lancado = Double.parseDouble(partes[1]);
          mes_lancado = Double.parseDouble(partes[2]);
          dia_lancado = Double.parseDouble(partes[3]);
          spotify_numero_playlist = Double.parseDouble(partes[4]);
          spotify_ranking = Double.parseDouble(partes[5]);
          streams = Double.parseDouble(partes[6]);
          apple_numero_playlist = Double.parseDouble(partes[7]);
          apple_ranking = Double.parseDouble(partes[8]);
          deezer_numero_playlist = Double.parseDouble(partes[9]);
          deezer_ranking = Double.parseDouble(partes[10]);
          shazam_ranking = Double.parseDouble(partes[11]);
          bpm = Double.parseDouble(partes[12]);
          key = partes[13];
          mode = partes[14];
          danceability = Double.parseDouble(partes[15]);
          valence = Double.parseDouble(partes[16]);
          energy = partes[17];
          acousticness = partes[18];
          instrumentalness = partes[19];
          liveness = partes[20];
          speechiness = partes[21];

        }
        else{

          nome_artista = partes[1];
          numero_artistas = Double.parseDouble(partes[2]);
          ano_lancado = Double.parseDouble(partes[3]);
          mes_lancado = Double.parseDouble(partes[4]);
          dia_lancado = Double.parseDouble(partes[5]);
          spotify_numero_playlist = Double.parseDouble(partes[6]);
          spotify_ranking = Double.parseDouble(partes[7]);
          streams = Double.parseDouble(partes[8]);
          apple_numero_playlist = Double.parseDouble(partes[9]);
          apple_ranking = Double.parseDouble(partes[10]);
          deezer_numero_playlist = Double.parseDouble(partes[11]);
          deezer_ranking = Double.parseDouble(partes[12]);
          shazam_ranking = Double.parseDouble(partes[13]);
          bpm = Double.parseDouble(partes[14]);
          key = partes[15];
          mode = partes[16];
          danceability = Double.parseDouble(partes[17]);
          valence = Double.parseDouble(partes[18]);
          energy = partes[19];
          acousticness = partes[20];
          instrumentalness = partes[21];
          liveness = partes[22];
          speechiness = partes[23];

        }
        
        

        //criar  objeto Musica
        Musica m = new Musica(nome_musica, nome_artista, numero_artistas, ano_lancado, mes_lancado, dia_lancado, spotify_numero_playlist, spotify_ranking, streams, apple_numero_playlist, apple_ranking, deezer_numero_playlist, deezer_ranking, shazam_ranking, bpm, key, mode, danceability, valence, energy, acousticness, instrumentalness, liveness, speechiness);
        lista.add(m);

        //imprimir
        System.out.println("Nome da musica: " + nome_musica + "/nNomedo Artista: " + nome_artista + "/nNumero de Artistas: " + numero_artistas + "/nAno lançado: " + ano_lancado + "/nMes lançado: " + mes_lancado + "/nDia lançado: " + dia_lancado + "/nNumero de Playlists no Spotify: " + spotify_numero_playlist);
      }
      leitor.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return lista;
  }
    
}
