package czc.lazyhelper.view;

import java.util.List;

import czc.lazyhelper.base.BaseView;

/**
 * 中间4位
 * Created by czc on 2018/8/1.
 */

public interface Center4NumView extends BaseView{
    void begin();
    void success(List<String> data);
    void end();
    void error();
}
