package org.hubert.springboot.mysql57.mybatisplus.gencode.service.impl;

import org.hubert.springboot.mysql57.mybatisplus.gencode.entity.TbUser;
import org.hubert.springboot.mysql57.mybatisplus.gencode.mapper.TbUserMapper;
import org.hubert.springboot.mysql57.mybatisplus.gencode.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hubertwong
 * @since 2024-01-05
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
