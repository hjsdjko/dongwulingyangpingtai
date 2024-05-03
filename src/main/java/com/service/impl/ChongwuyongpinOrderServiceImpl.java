package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.ChongwuyongpinOrderDao;
import com.entity.ChongwuyongpinOrderEntity;
import com.service.ChongwuyongpinOrderService;
import com.entity.view.ChongwuyongpinOrderView;

/**
 * 商品订单 服务实现类
 */
@Service("chongwuyongpinOrderService")
@Transactional
public class ChongwuyongpinOrderServiceImpl extends ServiceImpl<ChongwuyongpinOrderDao, ChongwuyongpinOrderEntity> implements ChongwuyongpinOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<ChongwuyongpinOrderView> page =new Query<ChongwuyongpinOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
