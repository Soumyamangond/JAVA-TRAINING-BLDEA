package java_training_bldea;
	// TODO Auto-generated method stub
class Animal extends Object{
				Animal(){
					super();
					System.out.println("inside zero-parameterized constructer");
				}

				Animal(int a){
					super();
					System.out.println("inside parameterized constructer");
				}
			}
class Nayi extends Animal{
				Nayi(){
					super(10);
				}
			}

			public class Text11{

				public static void main(String[] args) {
					Nayi d1=new Nayi();	

				}
}
