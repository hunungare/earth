import java.util.*;
class arear
{
	float ans;
	
	void arear(int l,int b)
	{
		ans=(l*b)*2;
		System.out.println("Area of rectangle is=="+ans);
	}
	
}
class areac
{
	int res;
	void areac(int r)
	{
		res=3.14*r*r;
		System.out.println("Area of circle is="+res);
	}
}
	
class area_0
{
	public static void main(String[] args)
	{
		arear obj=new arear();
		areac ob= new areac();
		obj.arear(2,8);
		ob.areac(4);
	}

}
