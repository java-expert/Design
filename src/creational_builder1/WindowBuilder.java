package creational_builder1;

public class WindowBuilder {
	
	public static Window createWindow(){
		System.out.println("sdk test***********************************");
		Toolbar toolbar=new Toolbar();
		Menu menu=new Menu();
		Window w=new Window();
		w.setToolbar(toolbar);
		w.setMenu(menu);
		return w;
	}

}
