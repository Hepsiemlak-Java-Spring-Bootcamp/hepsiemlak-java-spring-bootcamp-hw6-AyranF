package emlakburada.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import emlakburada.dto.request.AddressRequest;
import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;
import emlakburada.model.Address;
import emlakburada.model.Banner;
import emlakburada.repository.BannerRepository;

@SpringBootTest
public class BannerServiceTest {
	
	@InjectMocks
	private BannerService bannerService;
	
	@Mock
	BannerRepository bannerRepository;
	
	@Test
	void saveBannerTest() {
		
		Mockito.when(bannerRepository.saveBanner(any())).thenReturn(prepareBanner());
		
		bannerService.saveBanner(prepareBannerRequest());
		
		Mockito.verify(bannerRepository).saveBanner(any());	
		
	}
	
	@Test
	void getAllBannersTest() {
		
		Mockito.when(bannerRepository.findAllBanners()).thenReturn(prepareBannerList());

		List<BannerResponse> responselist = bannerService.getAllBanners();
		
		assertNotEquals(0,responselist.size());
		
	}
	
	List<Banner> prepareBannerList(){
		List<Banner> bannerlist = new ArrayList<>();
		bannerlist.add(prepareBanner());
		bannerlist.add(prepareBanner());
		bannerlist.add(prepareBanner());
		return bannerlist;
		
	}

	BannerRequest prepareBannerRequest() {
		BannerRequest request = new BannerRequest();
		request.setAddress(new AddressRequest());
		request.setTotal(1);
		request.setAdvertNo(0);
		request.setPhone("123123");
		return request;
	}
	
	
	
	Banner prepareBanner() {
		Banner banner = new Banner();
		banner.setAddress(new Address());
		banner.setTotal(1);
		banner.setAdvertNo(0);
		banner.setPhone("123123");
		return banner;
	}
	
}
