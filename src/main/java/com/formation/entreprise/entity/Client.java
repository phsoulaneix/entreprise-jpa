package jpa;


public class Client extends Personne {

  private Adresse adresse;

  public Adresse getAdresse() {
    return adresse;
  }

  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
  }

}
