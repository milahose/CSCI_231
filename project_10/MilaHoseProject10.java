class MilaHoseProject10 {
  public static void main(String[] args) {
    
  }
}

class MyString {
  private char[] data;

  MyString(char[] _data) {
    data = _data;
  }

  public int charAt(char c) {

  }

  public int length() {
    int count = 0;
    for (int i = 0; i < data.length; i++) {
      count++;
    }
    return count;
  }

  public MyString substring(int begin, int end) {
  }

// +substring(begin:	int,	end:	int)	:	MyString
// +toLowerCase()	:	MyString
// +equals(other:	MyString)	:	Boolean
// +valueOf(i:	int)	:	MyString


}