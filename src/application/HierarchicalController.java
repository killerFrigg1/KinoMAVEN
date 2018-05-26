package application;

public interface HierarchicalController<P extends HierarchicalController<?>> {

	public P getParentController();

	public void setParentController(P parent);

}