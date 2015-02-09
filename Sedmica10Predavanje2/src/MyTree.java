public class MyTree {
	private String data;
	private MyTree left;
	private MyTree right;

	public MyTree() {
		this.left = null;
		this.right = null;
		this.data = null;
	}

	public MyTree(String data){
		if (this.data == null){
			this.data = data;
			this.left = null;
			this.right = null;
		}else{
			
		}
	}
}
