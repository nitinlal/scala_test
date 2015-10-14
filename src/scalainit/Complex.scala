

package scalainit

class Complex (real : Integer, imaginary : Float) {
  
  def re() = real;
  def im() = imaginary;
  
 // notice how you overload below 
  
 // def real() = real; , but if you overload it you need to specify result type,
  //makes sense
  }