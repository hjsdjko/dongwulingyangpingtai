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
import com.dao.ChongwuyongpinCollectionDao;
import com.entity.ChongwuyongpinCollectionEntity;
import com.service.ChongwuyongpinCollectionService;
import com.entity.view.ChongwuyongpinCollectionView;

/**
 * 商品收藏 服务实现类
 */
@Service("chongwuyongpinCollectionService")
@Transactional
public class ChongwuyongpinCollectionServiceImpl extends ServiceImpl<ChongwuyongpinCollectionDao, ChongwuyongpinCollectionEntity> implements ChongwuyongpinCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<ChongwuyongpinCollectionView> page =new Query<ChongwuyongpinCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
