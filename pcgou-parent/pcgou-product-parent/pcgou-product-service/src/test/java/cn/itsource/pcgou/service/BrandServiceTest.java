package cn.itsource.pcgou.service;

import cn.itsource.basic.util.PageList;
import cn.itsource.pcgou.domain.Brand;
import cn.itsource.pcgou.query.BrandQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandServiceTest {

    @Autowired
    private IBrandService brandService;

    @Test
    public void test(){
        brandService.list().forEach(e->{
            System.out.println(e);
        });
    }

    @Test
    public void test3(){
        int i =128;
        int j =128;
        System.out.println(i == j);
    }

    @Test
    public void test1(){
        Brand brand = new Brand();
        brand.setName("xxx");
        brandService.save(brand);
    }

    @Test
    public void test2(){
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.setPageNum(1);
        brandQuery.setPageSize(10);
        PageList<Brand> brandPageList = brandService.queryPage(brandQuery);
        System.out.println(brandPageList.getRows());

    }

    @Test
    public void queryPage() {
        BrandQuery query = new BrandQuery();
        query.setKeyword("狼");
        PageList<Brand> pageList = brandService.queryPage(query);
        System.out.println(pageList.getTotal());
        pageList.getRows().forEach(e->{
            System.out.println(e);
        });

    }
}