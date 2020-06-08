package guoyang_liu_exercise1;

public class PieceWorker extends Employee{
	private double wage; // the employee’s wage per piece
	   private int pieces ; // the number of pieces produced
	   
	// constructor
	   public PieceWorker(String firstName, String lastName,
			      String socialSecurityNumber, double wage, int pieces) {
			      super(firstName, lastName, socialSecurityNumber);

			      if (wage < 0.0) { // validate wage
			         throw new IllegalArgumentException("Hourly wage must be >= 0.0");
			      }

			       // validate pieces
			    	  if (pieces < 0 || pieces %1 != 0) { // validate wage
					         throw new IllegalArgumentException("Pieces must be >= 0 and an integer");
					      }

			      this.wage = wage;
			      this.pieces = pieces;
			   } 
	   
	// set wage
	   public void setWage(double wage) {
	      if (wage < 0.0) { // validate wage
	         throw new IllegalArgumentException("Wage must be >= 0.0");
	      }

	      this.wage = wage;
	   } 

	   // return wage
	   public double getWage() {return wage;}

	   // set the number of pieces produced
	   public void setPieces(int pieces) {
		   if (pieces < 0 || pieces %1 != 0) { // validate wage
		         throw new IllegalArgumentException("Pieces must be >= 0 and an integer");
		      }

	      this.pieces = pieces;
	   } 

	   // return the number of pieces produced
	   public int getPieces() {return pieces;}
	   
	// calculate earnings; override abstract method earnings in Employee
	   @Override                                                           
	   public double earnings() {                                          
	      return getPieces() * getWage();                                                       
	   }                                                                 

	   // return String representation of HourlyEmployee object              
	   @Override                                                             
	   public String toString() {                                            
	      return String.format("Piece worker: %s%n%s: $%,.2f; %s", 
	         super.toString(), "hourly wage", getWage(),                     
	         "hours worked", getPieces());                                    
	   }            
		   
	   }//end class

