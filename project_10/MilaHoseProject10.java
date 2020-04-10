class MilaHoseProject10 {
  public static void main(String[] args) {
    char[] someString = {'H', 'E', 'L', 'L', 'o', ' ', 'w', 'o', 'R', 'l', 'D', '!'};
    char[] someOthStr = {'H', 'E', 'L', 'L', 'o', ' ', 'w', 'o', 'R', 'l', 'D'};
    MyString myString = new MyString(someString);
    MyString myOthStr = new MyString(someOthStr);
    System.out.println(myString.charAt(6));
    System.out.println(myString.length());
    System.out.println(myString.substring(6, 11));
    System.out.println(myString.toLowerCase());
    System.out.println(myString.equals(myOthStr));
    System.out.println(myString.valueOf(12345));
  }
}

class MyString {
  private char[] data;

  MyString(char[] data) {
    this.data = new char[data.length];
    for (int i = 0; i < data.length; i++) {
      this.data[i] = data[i];
    }
  }

  public char charAt(int i) {
    return data[i];
  }

  public int length() {
    int count = 0;
  
    for (int i = 0; i < data.length; i++) {
      count++;
    }

    return count;
  }

  public MyString substring(int begin, int end) {
    char[] substring = new char[end - begin];
  
    for(int i = 0; i < substring.length; i++) {
      substring[i] = data[begin + i];
    }
  
    return (new MyString(substring));
  }

  public MyString toLowerCase() {
    char[] lowercase = new char[data.length];

    for(int i = 0; i < data.length; i++){
      lowercase[i] = data[i];
      if(lowercase[i] >= 'A' && lowercase[i] <= 'Z') {
        lowercase[i] += 32;
      }
    }
    
    return (new MyString(lowercase));
  }

  public boolean equals(MyString other) {

    if (this.length() != other.length()) {
      return false;
    }
    
    for (int i = 0; i < data.length; i++) {
      if (other.charAt(i) != data[i]) {
        return false;
      }
    }

    return true;
  }

  public MyString valueOf(int i) {
    int length = 0;
    int iCopy = i;

    while (iCopy > 0) {
      iCopy /= 10;
      length++;
    }

    iCopy = i;
    char[] value = new char[length];
    for (int j = length - 1; j >= 0; j--) {
      value[j] = (char)((iCopy % 10) + 48);
      iCopy /= 10;
    }

    return (new MyString(value));
  }
}
