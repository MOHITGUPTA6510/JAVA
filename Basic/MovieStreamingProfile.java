class StreamingProfile{
    private String profileName;
    private boolean isChildProfile;
    private int ageRestriction ;
    
    public StreamingProfile(String profileName , boolean isChildProfile){
        this.profileName = profileName;
        this.isChildProfile = isChildProfile;
        
        if(this.isChildProfile == true){
            this.ageRestriction = 12;
        }
        else{
            this.ageRestriction = 18;
        }
    }
    
    void watchMovie(String movieName , int movieRating){
        if (movieRating > this.ageRestriction){
            System.out.println("Access Denied "+movieName+" is to mature for  this movie");
            
        }
        else{
            System.out.println("Now Streaming : "+movieName);
        }
    }
}

public class MovieStreamingProfile{
    public static void main(String[] args){
        
        StreamingProfile firstMan = new StreamingProfile("Mohit", true);
        
        firstMan.watchMovie("mars" , 9);
    } 
}