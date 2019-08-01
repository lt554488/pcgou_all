package cn.itsource.pcgou.service.impl;

import cn.itsource.pcgou.domain.Product;
import cn.itsource.pcgou.mapper.ProductMapper;
import cn.itsource.pcgou.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author litao
 * @since 2019-08-01
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
