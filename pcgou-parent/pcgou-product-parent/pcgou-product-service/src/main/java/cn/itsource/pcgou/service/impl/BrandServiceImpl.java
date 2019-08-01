package cn.itsource.pcgou.service.impl;

import cn.itsource.basic.util.PageList;
import cn.itsource.pcgou.domain.Brand;
import cn.itsource.pcgou.mapper.BrandMapper;
import cn.itsource.pcgou.query.BrandQuery;
import cn.itsource.pcgou.service.IBrandService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author litao
 * @since 2019-08-01
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public PageList<Brand> queryPage(BrandQuery query) {
        //查询总数
        //查询当前页的数据
        Page<Brand> page = new Page<>(query.getPageNum(),query.getPageSize());
        IPage<Brand> ip = baseMapper.queryPage(page, query);
        //封装到PageList返回
        return new PageList<>(ip.getTotal(),ip.getRecords());
    }
}
