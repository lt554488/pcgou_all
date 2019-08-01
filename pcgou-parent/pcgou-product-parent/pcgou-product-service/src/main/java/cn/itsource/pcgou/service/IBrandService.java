package cn.itsource.pcgou.service;

import cn.itsource.basic.util.PageList;
import cn.itsource.pcgou.domain.Brand;
import cn.itsource.pcgou.query.BrandQuery;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author litao
 * @since 2019-08-01
 */
public interface IBrandService extends IService<Brand> {

    PageList<Brand> queryPage(BrandQuery query);
}
