package ch.elbernito.tools.views.settings;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Settings")
@Route("settings")
@Menu(order = 2, icon = LineAwesomeIconUrl.ICONS_SOLID)
public class SettingsView extends Composite<VerticalLayout> {

    public SettingsView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
