
package plugins.empty;

import org.molgenis.framework.db.Database;
import org.molgenis.framework.server.MolgenisRequest;
import org.molgenis.framework.ui.EasyPluginController;
import org.molgenis.framework.ui.ScreenController;
import org.molgenis.framework.ui.ScreenView;
import org.molgenis.framework.ui.html.ActionInput;
import org.molgenis.framework.ui.html.MolgenisForm;
import org.molgenis.framework.ui.html.StringInput;

public class EmptyPlugin extends EasyPluginController<EmptyPlugin>
{
	public EmptyPlugin(String name, ScreenController<?> parent)
	{
		super(name, parent);
		this.setModel(this); //you can create a seperate class as 'model'.
	}
	
	//what is shown to the user
	public ScreenView getView()
	{
		//uncomment next line if you want to use template file instead
		//return new FreemarkerView("EmptyPluginView.ftl", getModel()); 
		
		MolgenisForm view = new MolgenisForm(this);
		
		view.add(new StringInput("helloName"));
		view.add(new ActionInput("sayHello"));
		
		return view;
	}
	
	private String helloName = "UNKNOWN";
	
	//matches ActionInput("sayHello")
	public void sayHello(Database db, MolgenisRequest request)
	{
		if(!request.isNull("helloName"))
		{
			this.helloName = request.getString("helloName");
		}
	}
	
	@Override
	public void reload(Database db) throws Exception
	{	
//		//example: update model with data from the database
//		Query q = db.query(Person.class);
//		q.like("name", "john");
//		getModel().investigations = q.find();
	}
}