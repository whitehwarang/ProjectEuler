/*
public class Problem93 {
	public static void main(String[] args)
	{
		int max=0;

		for(int A=1; A<10; A++)
		for(int B=A+1; B<10; B++)
		for(int C=B+1; C<10; C++)
		for(int D=C+1; D<10; D++)
		{
			double[] set = {A, B, C, D};
			String answers = ",";
	
			double[] set_ = {set[0],set[1],set[2],set[3]};		
			double result1;
			for(int a=0; a<4; a++)
			{
				result1 = set_[a];
				
				for(int op1=0; op1<5; op1++)
				{	// 0 : +, 1 : x, 2 : -, 3 : 0/, 4 : /0
					
					for(int b=0; b<4; b++)
					{
						if(b==a) continue;
						double result2 = result1;
						if(op1==0) result2 = result2+set_[b]; // 0 : +
						else if(op1==1) result2 = result2*set_[b]; // 1 : x
						else if(op1==2) result2 = result2-set_[b]; // 2 : -
						else if(op1==3) result2 = result2/set_[b]; // 3 : 0/
						else if(op1==4) result2 = set_[b]/result2; // 4 : /0
						
						for(int op2=0; op2<5; op2++)
						{	// 0 : +, 1 : x, 2 : -, 3 : 0/, 4 : /0
							
							for(int c=0; c<4; c++)
							{
								if(c==a || c==b) continue;
								double result3 = result2;
								if(op2==0) result3 = result3+set_[c]; // 0 : +
								else if(op2==1) result3 = result3*set_[c]; // 1 : x
								else if(op2==2) result3 = result3-set_[c]; // 2 : -								
								else if(op2==3) result3 = result3/set_[c]; // 3 : 0/
								else if(op2==4) result3 = set_[c]/result3; // 4 : /0
								
								for(int op3=0; op3<5; op3++)
								{	// 0 : +, 1 : x, 2 : -, 3 : 0/, 4 : /0
									
									for(int d=0; d<4; d++)
									{
										if(d==a || d==b || d==c) continue;
										
										double result4 = result3;
										if(op3==0) result4 = result4+set_[d]; // 0 : +
										else if(op3==1) result4 = result4*set_[d]; // 1 : x
										else if(op3==2) result4 = result4-set_[d]; // 2 : -								
										else if(op3==3) result4 = result4/set_[b]; // 3 : 0/
										else if(op3==4) result4 = set_[b]/result4; // 4 : /0
	
										if(result4 % 1.0 == 0.0 && result4 > 0)
											if(!answers.contains(","+(int)result4+","))
												answers += (int)result4+",";
									}
								}
								
								if(op2==3 || op2==4)
								{
									result3 = result2;							
									for(int op3=0; op3<5; op3++)
									{	// 0 : +, 1 : x, 2 : -, 3 : 0/, 4 : /0
	
										for(int d=0; d<4; d++)
										{
											if(d==a || d==b || d==c) continue;
											
											double otherpart=1;
											if(op3==0) otherpart = set_[c]+set_[d];
											else if(op3==1) otherpart = set_[c]*set_[d];
											else if(op3==2) otherpart = set_[c]-set_[d];
											else if(op3==3) otherpart = set_[c]/set_[d];
											else if(op3==4) otherpart = set_[d]/set_[c];
											
											double result4=0;
											if(op2==3)
												result4 = result3/otherpart;
											else if(op2==4)
												result4 = otherpart/result3;
	
											if(result4 % 1.0 == 0.0 && result4 > 0)
												if(!answers.contains(","+(int)result4+","))
													answers += (int)result4+",";
	
										}		
									}
								}			
							}		
						}		
					}	
				}		
			}
			int i=1;
			while(answers.contains("," + i + ","))
			{
				i++;
			}
			
			if(max<i-1)
			{
				max = i-1;
				System.out.println(A+","+B+","+C+","+D+" : "+max);
			}

		}
		
	}
	
	
}
*/