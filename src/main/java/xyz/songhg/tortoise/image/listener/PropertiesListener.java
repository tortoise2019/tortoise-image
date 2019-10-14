package xyz.songhg.tortoise.image.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import xyz.songhg.tortoise.image.utils.PropertiesUtil;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/13 23:48
 */
public class PropertiesListener implements ApplicationListener<ApplicationEvent> {

    private String filename;

    public PropertiesListener (String filename) {
        this.filename = filename;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        PropertiesUtil.loadAllProperties(filename);
    }
}
