
public class FizzBuzz {
	
	private int nb;

	public FizzBuzz(){}

	public FizzBuzz(int nb) {
		this.nb = nb;
	}

	public void setNb(int nb){
	    this.nb = nb;
    }

    public boolean isMultipleThree(int nb){
        if(nb % 3 == 0) return true;
        else return false;
    }

    public boolean isMultipleFive(int nb){
        if(nb % 5 == 0) return true;
        else return false;
    }

    public boolean isMultipleThreeFive(int nb){
        if(nb % 3 == 0 && nb % 5 == 0) return true;
        else return false;
    }

    public boolean isValidNumber(int nb){
	    if(nb > 0) return true;
	    else return false;
    }


	public void afficher() {
        for (int i = 1; i <= this.nb; i++) {
            if (isMultipleThreeFive(i)) System.out.println("FizzBuzz");
            else if (isMultipleFive(i)) System.out.println("Buzz");
            else if (isMultipleThree(i)) System.out.println("Fizz");
            else System.out.println(i);
        }
    }

}
