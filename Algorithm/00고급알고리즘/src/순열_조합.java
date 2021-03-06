import java.util.Arrays;

public class 순열_조합
{
	public static int arr[] =
	{ 23, 3, 5, 9};
	public static int save[];
	public static int visited[];
	public static int n;
	
	public static int r;

	public static void main(String[] args)
	{
//		n = 5;
		n = arr.length;
		r = 4;
		save = new int[r];
		visited = new int[n];

//		System.out.println("=======중복순열========");
//		OverPerm(0);
//		System.out.println("=======순열========");
//		perm(0);
//		System.out.println("=======중복조합========");
//		OverComb(0, 0);
		System.out.println("=======조합========");
		for(int i = 1; i <= r; i ++) {
			comb(0, 0, i);			
		}
	}

	public static void OverPerm(int cnt)
	{
		if (cnt == r)
		{
			System.out.println(Arrays.toString(save));
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				save[cnt] = arr[i];
				OverPerm(cnt + 1);
			}
		}
	}

	public static void perm(int cnt)
	{
		if (cnt == r)
		{
			System.out.println(Arrays.toString(save));
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				if (visited[i] == 0)
				{
					visited[i] = 1;
					save[cnt] = arr[i];
					perm(cnt + 1);
					visited[i] = 0;
				}
			}
		}
	}

	public static void OverComb(int start, int cnt)
	{
		if (cnt == r)
		{
			System.out.println(Arrays.toString(save));
		}
		else
		{
			for (int i = start; i < n; i++)
			{
				save[cnt] = arr[i];
				OverComb(i, cnt + 1);
			}
		}
	}

	public static void comb(int start, int cnt, int end)
	{
		if (cnt == end)
		{
			System.out.println(Arrays.toString(save));
		}
		else
		{
			for (int i = start; i < n; i++)
			{
				save[cnt] = arr[i];
				comb(i + 1, cnt + 1, end);
			}
		}
	}
}