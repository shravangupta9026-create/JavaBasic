package Constructors;

class Movie {
    String movieName;
    float movieTime;
    int movieDate;
    int moviePrice;

    Movie(){
    
}



Movie(String mN, float mT, int mD, int mP){
    movieName = mN;
    movieTime = mT;
    movieDate = mD;
    moviePrice = mP;
}

public class ConstructorMovie {
    public static void main(String[] args) {

        Movie m1 = new Movie("Mirzapur",11.15f,9, 85 );
        System.out.println(m1.movieName);
        System.out.println(m1.movieTime);
        System.out.println(m1.movieDate);
        System.out.println(m1.moviePrice);
    }
    
}
}

