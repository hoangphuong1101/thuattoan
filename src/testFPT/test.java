/**
 * 
 */
package testFPT;

import java.util.Random;

import javax.naming.ldap.SortControl;

/**
 * @author Administrator
 *
 */
public class test {
	// số nguyên tố
	public int giaiThua(int n){
		if(n<2)return 1;
		else{
			return n*giaiThua(n-1);
		}
	}
	// ước chung lớn nhất
	public int UCLN(int a, int b){
		if(a==b) return a;
		if(a%b==0)return b;
		if(b%a==0)return a;
		if(a>b)return UCLN(a%b, b);
		return UCLN(b%a, a);
	}
	// bội chung nhỏ nhất
	public int BCNN(int a, int b){
		return (a*b)/UCLN(a, b);
	}
	// tổng các chữ số
	public int tongSo(int a){
		int temp = a;
		int tong =0;
		do {
			tong+=temp%10;
			temp=temp/10;
		} while (temp>0);
		return tong;
	}
	// kiểm tra số nguyên tố
	public boolean isSoNguyenTo(int a){
		if(a<2)return false;
		for(int i=2; i*i<=a; i++){
			if(a%i==0) return false;
		}
		return true;
	}
	// phân tích ra thừa số nguyên tố
	public void thuaSoNguyenTo(int a){
		if(a<2) System.out.println("không thể phân tích ra thừa số nguyên tố đối với số này");
		if(a==2)System.out.println(2);
		else{
			int i=2;
			while(a>1){
				if(a%i==0){
					System.out.print(i+"*");
					a/=i;
					if(isSoNguyenTo(a)){
						System.out.print(a);
						break;
					}
				}
				else i++;
			}
		}
	}
//	Bài 5. Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
	public void showSoNguyenTo(int a){
		for(int i=2;i<=a;i++){
			if(isSoNguyenTo(i)) System.out.println(i);
		}
	}
//	Bài 6. Viết chương trình liệt kê n số nguyên tố đầu tiên.
	public void nSoNguyenToDau(int n){
		int i =1, j=1;
		while(true){
			i++;
			if(isSoNguyenTo(i)){
				System.out.print(i+" ");
				if(j==n)break;
				j++;
			}
		}
	}
	/*Bài 7. Dãy số Fibonacci được định nghĩa như sau: F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với 
			n>=2. Hãy viết chương trình tìm số Fibonacci thứ n.*/
	public int fibonacci(int n){
		if(n==0||n==1)return 1;
		else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	//số đối
	public boolean soDoi(int a){
		int m=0, n=a;
		while(true){
			m=m*10+n%10;
			n=n/10;
			if(n==0)break;
		}
		if(m==a)return true;
		else return false;
	}
	/*Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải
	hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau. Hãy 
	liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).*/
	public void soNghichDoc(){
		for(int i=100000;i<1000000;i++)
			if(soDoi(i))System.out.println(i);
	}
	// Viết chương trình liệt kê tất cả các xâu nhị phân độ dài n.
	private int x[]=null;
	public void xauNhiPhan(int i, int n){
		  int k;
		    for ( k=0; k<=1; k++)
		        {
		            x[i] = k;
		        if (i== n-1){
		        	for(int j=0; j<n; j++)
		       		 System.out.print(x[j]);;
		     		 System.out.print("\n");;
		 
				}
		        else
		        	xauNhiPhan(i+1,n);
		 
		        }
	}
	// số lớn nhất
	public int soLonNhat(int a, int b, int c){
		int maxx=a;
		if(maxx<b)maxx=b;
		if(maxx<c)maxx=c;
		return maxx;
	}
	// số lớn nhất trong 4 số
	public int soLonNhat(int a, int b, int c, int d){
		int[] arr = new int[4];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		quickSort(arr, 4);
		return arr[3];
	}
	// Selection Sort lựa chọn
	public void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++)
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){// đổi chổ cho nhau
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}
	//Quick Sort
	public void swap(int[] arr, int left,int right){
		int temp = arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	public void quickMethod(int[] arr, int left, int right){
		int l=left;
		int r=right;
		int mind=arr[(int)(left+right)/2];
		do {
			while(arr[l]<mind && l<right)l++;
			while(arr[r]>mind && r>left)r--;
			if(l<=r){
				swap(arr,l,r);
				l++;
				r--;
			}
			
		} while (l<=r);
		if(left<r)quickMethod(arr, left, r);
		if(right>l)quickMethod(arr, l, right);
	}
	public void quickSort(int[] arr, int n){
		quickMethod(arr, 0, n-1);
	}
	// tổng các số chẵn trong mảng số nguyên
	public int tongChan(int n){
		Random random = new Random();
		int[] arr = new int[n];
		int  tong=0;
		System.out.println("cho dãy số : ");
		for(int i=0;i<n;i++){
			arr[i]=random.nextInt(100);
			System.out.print(arr[i]+" ");
			if(arr[i]%2==0)tong+=arr[i];
		}
		return tong;
	}
	// đếm số
	public int demSo(String n){
		return n.length();
	}
	public int demSo(int n){
		String a=String.valueOf(n);
		return a.length();
	}
	// bài toán gà thỏ
	public void gaTho(int m, int n){
		int y,x;
		y=(n-2*m)/2;
		x = m-y;
		boolean yes=false;
		for(x=1;x<=m;x++){
			if(x+y==m && 2*x+4*y==n){
				yes=true;
				System.out.println(y+" "+x);
			}
		}
		if(yes==false)System.out.println(-1);
	}
	// tổng số nguyên tố trong mảng
	public int tongNguyenTo(int n){
		int[] arr= new int[n];
		Random random = new Random();
		int tong=0;
		for(int i=0;i<n;i++){
			arr[i]=random.nextInt(100);
			System.out.print(arr[i]+" ");
			if(isSoNguyenTo(arr[i]))tong+=arr[i];
		}
		return tong;
	}
//	bài toán mua hoa
	public int muaHoa(int hoa1, int hoa2, int tongTien){
		int maxHoa2 =tongTien/hoa2;
		int tongHoa=0;
		for(int i=0;i<=maxHoa2;i++){
			int t=i*hoa2+((tongTien-i*hoa2)/hoa1)*hoa1;
			if(tongHoa<t)tongHoa=t;
		}
		return tongHoa;
	}
	// 
	public int hoa(int hoa1,int hoa2, int tongTien){
		if(tongTien<hoa1 && tongTien<hoa2)return 0;
		if(hoa1==hoa2)return tongTien/hoa1;
		if(hoa1<hoa2)return muaHoa(hoa1, hoa2, tongTien);
		else return muaHoa(hoa2, hoa1, tongTien);
	}
	// xau chuoi
	public void chuoiNguoc(String st, int n){
		String str="";
		for(int i=0;i<n;i++){
			str=st.charAt(i)+str;
		}
		for(int i=st.length()-1;i>=n;i--){
			str+=st.charAt(i);
		}
		System.out.println(str);
	}
	// luu but
	public int luuBut(int n){
		Random random = new Random();
		int[] a = new int[n];
		int dem=1;
		System.out.println("cho dãy số : ");
		for(int i=0;i<n;i++){
			
			a[i]=random.nextInt(100);
			System.out.print(a[i]+" ");
		}
		quickSort(a, n);
		
		for(int i=0;i<n-1;i++){
			System.out.print(a[i]+" ");
			if(a[i]!=a[i+1])dem++;
		}
		return dem;
	}
	// khuyến mãi
	public int khuyenMai(int m, int n, int t){
		String str=String.valueOf(m);
		System.out.println(str);
		return t*(n-n/(m+1));
	}
//	Main
	public static void main(String[] args) {
		test so = new test();
//		System.out.println(so.giaiThua(12));
//		System.out.println(so.UCLN(8, 20));
//		System.out.println(so.BCNN(3, 2));
//		System.out.println(so.tongSo(12345));
//		System.out.println(so.isSoNguyenTo(2));
//		so.thuaSoNguyenTo(12);
//		so.showSoNguyenTo(15);
//		so.nSoNguyenToDau(100);
//		System.out.println();
//		System.out.println(so.fibonacci(5));
//		so.soNghichDoc();
////		so.xauNhiPharintln(so.soLonNhat(11, 53, 10));
//		System.out.println(so.soLonNhat(500, 1, 9, 3));
//		System.out.println("\n tổng chẵn là : "+so.tongChan(7));
//		System.out.println(so.demSo("12345678986768566586786578686868688"));
//		so.gaTho(43, 100);
//		System.out.println("\ntong nguyen to la: "+so.tongNguyenTo(12));
//		System.out.println(so.hoa(3, 5, 14));
//		so.chuoiNguoc("margorpgnim", 7);
//		System.out.println("\n"+so.luuBut(7));
//		System.out.println(so.khuyenMai(500, 50, 100));
//		System.out.println(so.demSo(0000000001));
		System.out.println(so.isSoNguyenTo(2));
	}
}
