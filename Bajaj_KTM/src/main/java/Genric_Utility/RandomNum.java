package Genric_Utility;

import java.util.Random;

public class RandomNum
{
public int randomnum()
{
	Random ran =new Random();
	int random = ran.nextInt(1000);
	return random;
}
}
