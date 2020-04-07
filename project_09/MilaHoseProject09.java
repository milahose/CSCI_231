package project_09;

class MilaHoseProject09 {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }
}

class Temperature {
  private double degree;
  private char scale;
  
  Temperature() {
    degree = 0;
    scale = 'C';
  }

  Temperature(double _degree) {
    degree = _degree;
    scale = 'C';
  }

  Temperature(char _scale) {
    degree = 0;
    scale = _scale;
  }

  Temperature(double _degree, char _scale) {
    degree = _degree;
    scale = _scale;
  }

  public double getDegreeInCelsius() {
    if (scale == 'C') {
      return degree;
    }

    return ((degree - 32) * 5 / 9);
  }

  public double getDegreeInFahrenheit() {
    if (scale == 'F') {
      return degree;
    }

    return ((1.8 * degree) + 32);
  }

  public void setDegree(double _degree) {
    degree = _degree;
  }

  public void setDegree(char _scale) {
    scale = _scale;
  }

  public void setDegree(double _degree, char _scale) {
    degree = _degree;
    scale = _scale;
  }

  public boolean equals(Temperature temp){
    return this.getDegreeInCelsius() == temp.getDegreeInCelsius();
  }

  public boolean isLessThan(Temperature temp){
    return this.getDegreeInCelsius() < temp.getDegreeInCelsius();
  }

  public boolean isGreaterThan(Temperature temp){
    return this.getDegreeInCelsius() > temp.getDegreeInCelsius();
  }
}