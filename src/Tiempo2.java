public class Tiempo2 {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo2(){
        this( 0, 0, 0 );
    }
    public  Tiempo2( int h){
        this( h, 0, 0);
    }
    public  Tiempo2( int h, int m){
        this( h, m, 0);
    }
    public  Tiempo2( int h, int m, int s ){
        setTiempo( h, m, s);
    }
    public  Tiempo2( Tiempo2 tiempo ){
        this( tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
    }
    public void setTiempo( int h, int m, int s ){
        setHora( h );
        setMinuto( m );
        setSegundo( s );
    }
    public  void setHora( int h ){
        hora = (( h >= 0 && h < 24) ? h : 0 );
    }
    public  void  setMinuto( int m ){
        minuto = (( m >= 0 && m < 60 ) ? m : 0);
    }
    public void setSegundo( int s ){
        segundo = (( s >= 0 && s < 60) ? s : 0);
    }
    public int getHora(){
        return hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public  int getSegundo(){
        return segundo;
    }
    public String aStringUniversal(){
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }
    public  String toString(){
        return String.format("%d:%02d:%02d %s",((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12), getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM"));
    }

}
