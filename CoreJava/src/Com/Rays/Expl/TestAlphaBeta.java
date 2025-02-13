package Com.Rays.Expl;
//package for Explicit Constructor. 
public class TestAlphaBeta {

	public static void main(String[] args) {
		Beta b = new Beta();
	}

}
// if we use Alpha a = new Alpha();
//then out put is ----Alpha is default constructor .. in that case only parent call will execute.

// and when we use Beta Constructor then parent and child both are execute 
// by default the default constructor of parent will be called 