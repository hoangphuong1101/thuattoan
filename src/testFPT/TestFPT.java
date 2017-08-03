package testFPT;

import java.util.Scanner;

public class TestFPT {
	/*//1. Viết chương trình in ra các 
	dấu * theo cấu trúc như sau 
	(cho n là chiều cao của tháp, cần in ra n dòng):*/
	public void chieuCaoThap(int n){
		int k=1;
		while(true){
			for(int i=1;i<=k;i++){
				System.out.print("* ");
			}
			System.out.println();
			k++;
			if(k>n)break;
		}
	}
	public String st(String str){
		return str;
	}
	//2.	Nhập vào tháng, năm bất kỳ. In ra số ngày tương ứng với tháng, năm đó.
	public void soNgayTrongThang(int mm, int yy ){
		
		switch (mm) {
		case 1 :;
		case 3 :;
		case 5 :;
		case 7 :;
		case 8 :;
		case 10 :;
		case 12: 
			for(int i=1;i<=31;i++){
				if(i%10==1) System.out.println();
				System.out.print(i+" ");
			}
			
			break;
		case 4 :;
		case 6 :;
		case 9 :;
		case 11: 
			for(int i=1;i<=30;i++){
				if(i%10==1) System.out.println();
				System.out.print(i+" ");
			}
			break;
		case 2:
			if(yy%4==0 && (yy%100!=0))
				for(int i=1;i<=29;i++){
					if(i%10==1) System.out.println();
					System.out.print(i+" ");
				}else
					for(int i=1;i<=28;i++){
						if(i%10==1) System.out.println();
						System.out.print(i+" ");
					}
			break;

		default:
			break;
		}
	}
	/*3.	Viết chương trình tính :
		S=1+1/2+1/3+....+1/n
*/
	public double tinhS(int n){
		if(n==1)return 1;
		return (double)(1/(double)n)+tinhS(n-1);
	}
	/*4.	Viết chương trình tính : 
		S=15-1+1/2-1/3!+....+(-1)n  1/n!
*/
	public double tinhSN(int n){
		if(n==1)return 14;
		else{
			if(n%2==0)return (double)(1/(double)n)+tinhSN(n-1);
			else return (double)(-1/(double)n)+tinhSN(n-1);
		}
	}
	/*5.	Viết chương trình tính  :
		S=1+1/3!+1/5!+…..+1/(2n-1)!
*/
	public double tinhSNLe(int n){
		if(n==1)return 1;
		return (double)(1/(double)(2*n-1))+tinhSNLe(n-1);
	}
	/*6.	Tính n!!	=	1*3*5*…..*n(n lẽ)
			=	2*4*6*….*n(n chẵn)
*/
	public int nGiaiThua(int n){
		if(n<3)return n;
		return n*nGiaiThua(n-2);
		/*if(n%2==1){
			if(n==1)return 1;
			else return n*nGiaiThua(n-2);
		}else{
			if(n==2)return 2;
			else return n*nGiaiThua(n-2);
		
		}*/
	}
	/*Nhập 2 số nguyên dương a và b. 
	Sau đó in ra ước chung lớn nhất và bội
	chung nhỏ nhất của 2 số nguyên dương a và b đó.*/
	//ước chung lớn nhất
	public int UCLN(int a,int b){
		if(a==b)return a;
		if(a<b){
			if(b%a==0)return a;
			return UCLN(b%a,a);
		} return UCLN(b, a);
	}
	// bội chung nhỏ nhất
	public int BCNN(int a, int b){
		return a*b/UCLN(a, b);
	}
	// In ra chuỗi đảo ngược của chuỗi đã cho va doi chuoi da cho sang chwx hoa
	public void chuoiNguoc(String st){
		String str="";
		for(int i=0;i<st.length();i++){
			str+=st.toUpperCase().charAt(i);
		}
		System.out.println(str);
	}
	
	// loai bỏ khoảng trắng
	 public String trimspace(String str)
	 {
	     str = str.replaceAll("\\s+", " ");
	     str = str.replaceAll("(^\\s+|\\s+$)", "");
	     return str;
	 }
	 // đổi chữ thường sang hoa và nguocj lại
	 public void doiChuoi(String st){
			String string="";
			for(int i=0;i<st.length();i++){
				int t =(int)(st.charAt(i));
				if(t>96)string+=st.toUpperCase().charAt(i);
				else string += st.toLowerCase().charAt(i);
			}
			System.out.println(string);
		}
	 //Nhập một mảng a gồm n phần tử kiểu nguyên int
	 public void scanner(){
		 int n;
		 int k;
		 Scanner prin = new Scanner(System.in);
		 System.out.println("nhập độ dài của mảng số nguyên");
		 n=prin.nextInt();
		 int[] a=new int[n];
		 System.out.println("nhập các phần tử của mảng: ");
		 for(int i= 0;i<n;i++){
			 a[i]=prin.nextInt();
		 }
		 System.out.println("nhập và kieenmr tra thử k có không ở vị trí nào trong mảng \nk = ");
		 k=prin.nextInt();
		 int i=0;
		 while(true){
			 if(k==a[i]){
				 System.out.println(k+"nằm tại vị trí thứ a["+i+"]");
				 break;
			 }
			 i++;
		 }
		 quickSort(a, n);
		 System.out.println("ham da dc sap xep");
		 for(int j= 0;j<n;j++){
			 System.out.print(a[j]+" ");
		 }
	 }
	 // nhập mảng các chuổi
	 public void scanner(String[] a, int n){
		 Scanner prin = new Scanner(System.in);
		 System.out.println("nhập độ dài của mảng kí tự");
		 n=prin.nextInt();
		 System.out.println("nhập các phần tử của mảng: ");
		 for(int i= 0;i<n;i++){
			 a[i]=prin.nextLine();
		 }
	 }
	 // tông số dương lẻ cuR MẢNG
	 public int tongLe(){
		 int tong =0;
		
		 int n;
		 Scanner prin = new Scanner(System.in);
		 System.out.println("nhập độ dài của mảng kí tự");
		 n=prin.nextInt();
		 int[] a=new int[n];
		 System.out.println("nhập các phần tử của mảng: ");
		 for(int i= 0;i<n;i++){
			 a[i]=prin.nextInt();
		 }
		 for(int i=0;i<n;i++){
			 if(a[i]>0&&a[i]%2==1)tong+=a[i];
		 }
		 return tong;
	 }
	 // ham swap
	 public void swap(int[] arr, int left,int right){
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
	 // ham quickSort
	 
	 public void quickSortMethod(int[] a, int left, int right){
		 int l=left;
		 int r=right;
		 int mid=a[(int)(left+right)/2];
		 do{
			 while(a[l]<mid && l<right)l++;
			 while(a[r]>mid && r>left)r--;
			 if(l<=r){
				 swap(a, l, r);
				 l++;
				 r--;
			 }
		 }while(l<=r);
		 if(l<right)quickSortMethod(a, l, right);
		 if(r>left)quickSortMethod(a, left, r);
	 }
	 public void quickSort(int[] a,int n){
		 quickSortMethod(a, 0, n-1);
	 }
	 // nhập ma trận cấp 2
	 public void matran(int m, int n){
		 int[][] a= new int[m][n];
		 Scanner prin = new Scanner(System.in);
		 for(int i=0;i<m;i++)
			 for(int j=0;j<n;j++){
				 System.out.print("a["+i+"]["+j+"]=");
				 a[i][j]=prin.nextInt();
				 System.out.println();
			 }
		 System.out.println("mang sau khi nhap");
		 for(int i=0;i<m;i++)
			 for(int j=0;j<n;j++){
				 System.out.print("a["+i+"]["+j+"]="+a[i][j]+" ");
				 if(j==n-1)System.out.println();
			 }
		 // Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận a.
		 int tich=1;
		 for(int i=0;i<n;i++){
			 if(a[0][i]%3==0)tich=tich*a[0][i];
		 }
		 System.out.println("tích các số là bội số của 3 "
		 		+ "nằm trên dòng đầu tiên của ma trận a la \ntich= "+tich);
		 // Tạo ra mảng một chiều X[i] với X[i] là các giá trị lớn nhất trên dòng i của ma trận a
		 int[] x=new int[m];
		 int index=0;
		 
		 while(true){
			 int maxLine=0;
			 for(int i=0;i<n;i++){
				if(maxLine<a[index][i])maxLine= a[index][i];
			 }
			 x[index]=maxLine;
			 index++;
			 if(index==m)break;
		 }
		 System.out.println("mang X can tim : ");
		 for(int i=0;i<m;i++){
				System.out.print(x[i]+" ");
			 }
		 //d.	Xoá đi phần tử đầu tiên của mảng X[i], xuất lại mảng X[i]. 
		 System.out.println("\nmang sau khi xoa phan tu dau tien :");
		 for(int i=0;i<m-1;i++){
			 x[i]=x[i+1];
			 System.out.print(x[i]+" ");
		 }
	 }
	//main
	public static void main(String[] args) {
		TestFPT fpt= new TestFPT();
		/*fpt.chieuCaoThap(6);
		fpt.soNgayTrongThang(2, 2017);
		System.out.println();
		System.out.println(fpt.tinhS(4));
		System.out.println(fpt.tinhSNLe(3));
		System.out.println(fpt.nGiaiThua(5));
		System.out.println(fpt.BCNN(8, 8));
		fpt.chuoiNguoc("hoang");
		System.out.println(fpt.trimspace("nguyen     quang hoang       "));
//		System.out.print(fpt.doiChuoi());
		fpt.doiChuoi("Nguyễn Quang Hoàng");
//		System.out.println(fpt.tongLe());
		fpt.scanner();*/
//		fpt.matran(3, 4);
//		System.out.println(fpt.nGiaiThua(6));
		fpt.chuoiNguoc("hoang");
	}
}
