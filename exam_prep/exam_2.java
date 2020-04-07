/**
 Write	a	while (or	for) statement	to	print	all	the	digits	of	an	int	type	variable	x,	one	digit	per	line.	
  For	example,	if	int	x	=	38625,	then	the	output	should	be	in	5	lines	as
  3
  8
  6
  2
  5
  (Hint:	You	may	use	built-in	method	to	get	a	String	representation	of	x	then	print	out	each	
  character	in	String)
  
  int	x	=	38625;
  String xStr = Integer.toString(x);

  for (int i = 0; i < xStr.length(); i++) {
    System.out.println(xStr.charAt(i));
  }
 */

 /**
  Write	a	while	(or	for)	statement	to	print	all	the	digits	of	an	int	type	variable	x	reversely,	one	digit	
  per	line.	For	example,	if	int	x	=	38625,	then	the	output	should	be	in	5	lines	as
  5
  2
  6
  8
  3
  (Hint:	Use	%	and	/	and	loop	can	do	this	one)
  
  int	x	=	38625;

  while (x > 0) {
    System.out.println(x % 10);
    x = (int)(x / 10);
  }
 */

/**
  Write	a	while	(or	do-while	loop)	loop	to	get	user’s	input	of	test	scores.	Keep	track	the	total	score	
  and	number	of	scores	entered.	When	user	enter	-1,	the	loop	finished	and	print	out	the	average	
  score.

  import java.util.Scanner;
  
  Scanner input = new Scanner (System.in);
    int scoreTotal = 0, nScores = 0, score = 0;;

    do {
      System.out.print("Enter your score (-1 to stop): ");
      score = input.nextInt();
      scoreTotal += score;
      nScores++;
    } while (score >= 0);
    
    System.out.println("Your average score is: " + (scoreTotal / nScores));
 */

/**
  Write	a	for (or	while) statement	to	calculate	the	sum	of	1+2+3+…+n	and	assign	the	result	to	an	
  int	type	variable	named	sum.	Assume	that	sum	and	int	type	variable	n	have	been	declared	and	n	
  has	been	initialized.	(Hint:	You	may	need	to	initialize	the	sum	to	be	zero	first)
  
  int sum = 0, n = 12;
  for (int i = 1; i <= n; i++) {
    sum += i;
  }

  System.out.println(sum);
 */

 /**
  Write	a	for	(or	while)	statement	to	calculate	the	factorial	of	n,	which	is	defined	as	n!	=	n*(n1)*…*2*1.	
  For	instance,	5!	=	5*4*3*2*1	=	120.	Aassign	the	result	to	an	int	type	variable	named	factorial.	
  Assume	that	factorial	and	int	type	variable	n	have	been	declared	and	n	has	been initialized.	
  (Hint:	You	may	need	to	initialize	the	factorial	to	be	one	first)
  
  int factorial = 1, n = 5;
  for (int i = n; i > 0; i--) {
    factorial *= i;
  }

  System.out.println(factorial);
 */


 /**
  Write	a	for (or	while) statement	to	calculate	the	sum	of	1+2+3+…+n	and	assign	the	result	to	an	
  int	type	variable	named	sum.	Assume	that	sum	and	int	type	variable	n	have	been	declared	and	n	
  has	been	initialized.	(Hint:	You	may	need	to	initialize	the	sum	to	be	zero	first)
  
  int sum = 0, n = 12;
  for (int i = 1; i <= n; i++) {
    sum += i;
  }

  System.out.println(sum);
 */

 /**
  Write	method	public static int	linearSearch(int	[]	arr,	ine	key)	which	returns	the	largest index	
  such	that	arr[index]	matches	the	key.	If	there	is	match,	returns	-1.
  
  public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        return i;
      }
    }

    return -1;
  }
 */

 /**
  Write	method	public	static	double	average(int	[]	arr)	which	returns	the	average	of	all	elements	
  in	given	array	arr.	Assume	that	arr	has	length	at	least	1.
  
  public static double average(int[] arr) {
    double total = 0.0;
    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
    }

    return total / arr.length;
  }
 */

 /**
  Write	method	public	void	crazyPrint(String	sentence,	int	n)	which	print	out	the	given	sentence	n	
  times.	Assume n is positive integer.
  
  public static void crazyPrint(String sentence, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(sentence);
    }
  }
 */

 /**
  Write	method	public	static	int	sum(int	n)	that	take	a	positive	integer	n	as	input	and	return	the	
  sum	of 1+2+…+n
  
  public static int sum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }
 */

 /**
  Write	method public	static	int binarySearch(int[]	arr,	int	target)	that	return	an	index	of	one	
  match	of	target	in	arr.	If	there	is	no	match,	return	-1.
  
  public static int binarySearch(int[] arr,	int	target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }

    return -1;
  }
 */

 /**
  Write	method public	static	int binarySearch(int[]	arr,	int	target)	that	return	an	index	of	one	
  match	of	target	in	arr.	If	there	is	no	match,	return	-1.
  
  public static int binarySearch(int[] arr,	int	target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }

    return -1;
  }
 */

 /**
  Write	a	method	public	static	initializeArray(int	[]	arr)	to	initialize	a	given	int	array	named	arr	with	
  random	numbers	between	101	and	200,	inclusive.
  
  public static void initializeArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random() * 200) + 101;
    }
  }
 */

 /**
  Suppose	that	int	[][]	triangle	=	new	int[3][];	Write	several	statements	to	initialize	triangle[0]	as	{1,	
  2};	triangle[1]	as	{3,	4,	5};	and	triangle[2]	=	{6,	7,	8,	9};
  
    int[][]	triangle	=	new	int[3][];
    
    triangle[0] = new int[]{1, 2};
    triangle[1] = new int[]{3, 4, 5};
    triangle[2] = new int[]{6, 7, 8, 9};
 */

 /**
  Write	public	static	int[]	sums(int	[][]	arr)	that	returns	an	integer	array,	in	which	ith	element	is	the	
  sum	of	ith	row	of	table	arr.
  
    int[][]	triangle	=	new	int[3][];
    
    triangle[0] = new int[]{1, 2};
    triangle[1] = new int[]{3, 4, 5};
    triangle[2] = new int[]{6, 7, 8, 9};

    public static int[] sums(int[][] arr) {
      int sumsArr[] = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
        int count = 0;
        for (int j = 0; j < arr[i].length; j++) {
          count += arr[i][j];
        }
        sumsArr[i] = count;
      }

      return sumsArr;
    }
 */

 /**
  Write	public	static	boolean	zeroDiagonal(int	[][]	arr)	which	returns	true	if	the	diagonal	elements	
  in	table	arr	are	all	zeros.	

    public static boolean zeroDiagonal(int[][] arr) {
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          if (arr[i][j] != 0) {
            return false;
          }
        }
      }

      return true;
    }
 */