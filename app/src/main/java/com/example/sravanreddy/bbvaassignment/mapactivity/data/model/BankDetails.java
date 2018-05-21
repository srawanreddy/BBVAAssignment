package com.example.sravanreddy.bbvaassignment.mapactivity.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

public class BankDetails implements Serializable{

    /**
     * html_attributions : []
     * next_page_token : CqQCHwEAAPv8mZIMOHhRaPA9QGys1Rm3o_dEStwhASBaQu5-eHElUoJIDS5wPwzsjphbYtyQZ_tqKxCEoXZUIlUQF5432Jkt4kY3vyf099HcWEQRqFGpwJYBKaZsRShVOaDzOEY48nkgvGjWtMy8FgkQypFd17lYFpxCaiheQXfIYN4xsfLEAajtA1TkQ41c_9_VvKCxO3bwnnGTrcX_k06f4T7lPex6U_2qX_0d2PtAbLVhdAMb5X_mXGMf7bzygsM7eY9xg1TNuzjQuTPbQhLoQG4TDoCjsNmb2QYKJF9SX0V0AjNeQtelBynNkrKMWo3rbDErAAn1dc-CklUPkKv7sCkwsqaFe0O7L9kJMkmHwvDMFbtiKwHNQZInUx3RaoJxMkQWOhIQNLIY0GAQwDZ1WxQOZoWANxoUOx6pvgAWCzwgnQFp5lzGvYc6eLU
     * results : [{"formatted_address":"3711 S Taylor Dr, Sheboygan, WI 53081, USA","geometry":{"location":{"lat":43.71496,"lng":-87.75447},"viewport":{"northeast":{"lat":43.71630982989272,"lng":-87.75312017010728},"southwest":{"lat":43.71361017010727,"lng":-87.75581982989273}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"f340dde8ca8f7ecbd1342ca47cc7088e96a492b7","name":"BBVA Compass","place_id":"ChIJF__3h8GmBIgRJSUU9lB6SYQ","reference":"CmRbAAAAm1qx4FPagEt3bXO7qsZXMc3NllTrUgSIqYiH-H2oOimz5jaFD9f6cyFm-pimoibAZ-NbyNeW6EzFFIXYBZEzQ4H_RtIQSTfa0uMJ95fVSpYieQlVWuwxqbU-_KB4moWkEhAAs2FUTuF0kGpI08iTYH5dGhRMriMRXuTghiNAfs9UGQAp2AZ88Q","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1100 E Commerce Blvd, Slinger, WI 53086, USA","geometry":{"location":{"lat":43.3253511,"lng":-88.2642884},"viewport":{"northeast":{"lat":43.32670092989273,"lng":-88.26293857010727},"southwest":{"lat":43.32400127010729,"lng":-88.26563822989272}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"2bb9fcbefe3e592b4402d521af701bce32eaf65c","name":"BBVA Compass","place_id":"ChIJQ-q-Zw1aBIgR5KSUtjiPm3c","reference":"CmRbAAAAmZ-kVg55XFvBKZsPabMnOXkfuJ0kS1vH-px4HTHZO0CJTd-ELlOL4EJanmuWwgnmHiCPLg_h9rTAWa_2taCI-YWbNoGqLZAGCjx2gKxv9nx2XAHbzA6hP30Grb3w_DNcEhBbWA4Q_977Qe5Wzg5TEp93GhTzIG79RWuZKLDEAbwNxVUxE6bxBw","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1234 WI-175, Hubertus, WI 53033, USA","geometry":{"location":{"lat":43.2343152,"lng":-88.18388809999999},"viewport":{"northeast":{"lat":43.23549987989272,"lng":-88.18315199999998},"southwest":{"lat":43.23280022010728,"lng":-88.18609640000001}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"04ef4efe326f8ed19b838f4d30d3a4265b3a5985","name":"BBVA Compass","place_id":"ChIJhzykKeFVBIgREp8AtWapYK8","reference":"CmRbAAAAWrkswgmDBshyBZaO0YSjoqHR8zIHF1rwOyLTxlMFgIjEJt6F1olfYzV9e0KnBGtVNWfeDfPYTnxjGC2uj-bYG4oViOLz2tK4yI6SPa6utyt4aR71gDbCebmrxLzl065CEhAzv0v_25LxIYafy-fWCQkiGhSJvLUf5oQN7tIvSpv1htgl4ggXSw","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"8340 W Appleton Ave, Milwaukee, WI 53218, USA","geometry":{"location":{"lat":43.1061049,"lng":-88.01665349999999},"viewport":{"northeast":{"lat":43.10732167989272,"lng":-88.01549937010728},"southwest":{"lat":43.10462202010728,"lng":-88.01819902989273}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"5a145db033645dab561ecee9050020dda4a4d194","name":"BBVA Compass","place_id":"ChIJ8dhJwjMDBYgRbMV37srg4dE","reference":"CmRbAAAAl0AbOqW7TNHsh8dwbwkHWpSbNhhL24AHw2LHWV28AxbP54kSMkSNgrnwp-nHnmIStqSkQN-0XE4n77C4yY3bINw0mvRhln1FfcPwOTq19x6MzGvS62EemZ2mvYTKlVQwEhBP0WNf4JGFIZTMkFnDn8EhGhRIeNoxXXpVHT-vM4U9cHJ1Q5KuuQ","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"701 5th Ave #7200, Seattle, WA 98104, USA","geometry":{"location":{"lat":47.6045052,"lng":-122.3306041},"viewport":{"northeast":{"lat":47.60595557989271,"lng":-122.3290092701072},"southwest":{"lat":47.60325592010727,"lng":-122.3317089298927}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"73bcde2dd4a14cc2789bc3bcdce127510d873a51","name":"BBVA Compass Loan Production Office (LPO)","place_id":"ChIJLcJfubBqkFQR4ea46gKnyA4","reference":"CmRbAAAA-pIEJ6QZ3EmVuOIrqSqiHBvuo6XcSodpMpGBJrh_XI0CLCDW3JMZWG6dR6UHlK7rScTrgX9eWxKdSKveweuQCqrEkw3bNZsLl3YR2Pm5BLuD_JsxLRVo1kO2iUlt0Vf9EhAlVI6pxwha7_BgJISDlPulGhToNsXPNhEwqRrbLtAuc5uOPeUFrw","types":["finance","point_of_interest","establishment"]},{"formatted_address":"524 S Layton Blvd, Milwaukee, WI 53215, USA","geometry":{"location":{"lat":43.0261557,"lng":-87.9463935},"viewport":{"northeast":{"lat":43.02749947989273,"lng":-87.94570372010728},"southwest":{"lat":43.02479982010728,"lng":-87.94840337989272}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"19e657de896232ff19db1b376f7265aeadc2aaf4","name":"BBVA Compass","place_id":"ChIJM3djkDsaBYgR2bwd1iiQlL4","reference":"CmRbAAAACTlxaC2suELrrR68S2fNxy_PpmvblXzb2tbaCaqxNMEzFe-j7pZr0ufakyHPYwhJDPsFmo6g25TEEEEkqkPklGmF-5ftQrBrVCoEU8sPKMOdo7Hizby2tJUWc5HF-8y2EhCbp_X-P6YYh9jPDWGpGnJ0GhQkTATQTNhJCIwKT4bl_xwjS3qxxQ","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1819 Geneva St, Delavan, WI 53115, USA","geometry":{"location":{"lat":42.6308022,"lng":-88.6128105},"viewport":{"northeast":{"lat":42.63215202989272,"lng":-88.61146067010726},"southwest":{"lat":42.62945237010727,"lng":-88.61416032989271}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"6ef78c5b01baeea8e6462be20195e41ce5948fdb","name":"BBVA Compass","place_id":"ChIJqX-wbcjwBYgR2I5zYUIJXyI","reference":"CmRbAAAAbbmv4bv7JAT6OU1N2HGPYBfOth91onlWHRIiNAWesJZaPOEJbxjXPGflEM9-xEdoEZrgwrOHcW-oIg5kiLMa9oNb1ep3ufAKqwWYyN6-olwgxJmM-9nLNgfuKdkzRhB_EhB27qZXvuwOb5GPuQFQsaHLGhQ-Cu8zmmhTeGGEHtM_QTn0a7gJoA","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1901 Milwaukee Ave, Burlington, WI 53105, USA","geometry":{"location":{"lat":42.7034715,"lng":-88.25409450000001},"viewport":{"northeast":{"lat":42.70482132989272,"lng":-88.25274467010728},"southwest":{"lat":42.70212167010728,"lng":-88.25544432989273}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"134b5e936b9ea503c96e0155687ba2a4259fef60","name":"BBVA Compass","place_id":"ChIJH3Ms-FCbBYgRBzvoHBtzbc8","reference":"CmRbAAAAa0lPb-vVSXiKYv3dG80iNPCaGhve34QWhRpgj_YHtMnWx-inpt9gBLvQ4jUJXuC1PAHm5ZY4f7YanGbZE5j3zVQl4JS6sGNNRnB3qDmWHRnUj59obtlUOsOs4MMxeZ4nEhBfaFR3gOW_EAtYW8zMswtwGhTSqNsAJB8o17auzS9D_UKxTXLbHA","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"801 S Figueroa St #1100, Los Angeles, CA 90017, USA","geometry":{"location":{"lat":34.0478376,"lng":-118.2618186},"viewport":{"northeast":{"lat":34.04909237989273,"lng":-118.2603124201073},"southwest":{"lat":34.04639272010728,"lng":-118.2630120798927}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"8a2381259a8a2eef521be945c4274364810f9a7c","name":"BBVA Compass Loan Production Office","opening_hours":{"open_now":true,"weekday_text":[]},"place_id":"ChIJAah2LLfHwoAR-bjrGpUJh3o","rating":3.7,"reference":"CmRbAAAAltQ0qgPeDSFQEKifcneWGsbPr_DYJ-SVCgzVgudfUMj9ktJq-ZTuAZbvXEbNrAKmhZodI1UhIXLp-6JRrHBueqaY3DnSODqVnkNjgS8OH8UDow_Myw-dAdekOG6Zd_vREhBHCOi8qjWdNB-3mj6ihTvkGhQFIcpgbe_Y9-MgKJyFUPktRJz9xg","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"Avenue des Arts 43, 1000 Bruxelles, Belgium","geometry":{"location":{"lat":50.843035,"lng":4.367667},"viewport":{"northeast":{"lat":50.84439632989272,"lng":4.368960429892722},"southwest":{"lat":50.84169667010728,"lng":4.366260770107278}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"670e7a9ba0b231e49b80acb70329b0230f53f77f","name":"BBVA","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108923346478590255553/photos\">BBVA Brussels<\/a>"],"photo_reference":"CmRaAAAA4mqM9lGEIZXKGAL6BZc08918T_NHeKas23gZIBLh6Qh1LCoMER-KaNlcY1SFYewgB7IwjARRT_h_e_O-Zvqy2l71X84uGHfMIAicIEOGOj7b9kixfe0EVA0GawA059rFEhBxa6VWZzXPRYtjbi_1wt4lGhROE6b7luQfVkZGFSuYdJrErDXVIQ","width":3264}],"place_id":"ChIJHdNccYPEw0cRrSZMS1zyh9A","rating":2.8,"reference":"CmRbAAAAQ6w3AyXyhkduS9tyLWC2jG38KbFnuicfyVcVgemhOnOBlbLw0VB5r6hgcFW72nITP7ZmE9sN_F4__ky5cfe-RtMnChstrq8VYmRz-KQ2XwsPdL25d5X3HDbBKrpzqg8BEhDbDvXWETGSq8OdRjbAuA5kGhT3hoOf4-bfVi1HgLWu_Q2y5bxQfg","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1401 17th St, Denver, CO 80202, USA","geometry":{"location":{"lat":39.7511639,"lng":-104.9971426},"viewport":{"northeast":{"lat":39.75243777989272,"lng":-104.9958889201073},"southwest":{"lat":39.74973812010727,"lng":-104.9985885798927}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"40ffe42cc5be9d8ff80152a2de0f6bb22144214f","name":"BBVA Compass","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":289,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102654792914981134569/photos\">BBVA Compass<\/a>"],"photo_reference":"CmRaAAAAaLVrSLk6fUmj32NcPOeuKOjgfKmE_YEfYd9jbEH93PpKsA1XzHzpZ77ZUN0_ZXInXUDHmR7qSIN-tBAUuHDNq6zKcwV50KmdnWvNbzsvQMv3gWLunueIeKz8yiKnchmMEhDfB76kqZp0fCeE67pN-JN1GhQNIu8og24WhSixj46Eli0iEC1isQ","width":512}],"place_id":"ChIJfS0yUNt4bIcRT7PrHOwVX68","rating":2.8,"reference":"CmRbAAAAYnjl7PkBdL99VZSQvFsh3F1LWWNI97q6dArOQCIvBntzy_zxX9W-ofgOwLKyrVK6YS1SXnxFOrbFJvkL_3vWXYtA4zg731BmY3JjBtqwjuMULN2ETcw7ZscSCPBkCq8QEhC99ADKjnX0691ZK-_FdgMPGhS-4zaYK1UN_WlqB-Tm6FmXAEpxqA","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"Avda. Mariscal López corner Torreani Viera, Asunción, Paraguay","geometry":{"location":{"lat":-25.2926555,"lng":-57.5839343},"viewport":{"northeast":{"lat":-25.29130567010728,"lng":-57.58258447010727},"southwest":{"lat":-25.29400532989272,"lng":-57.58528412989272}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"3e8608afec1c5345de14d9970646347cc3c74c7e","name":"BBVA","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":876,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/110630666142613155935/photos\">Cesar G. Bordon<\/a>"],"photo_reference":"CmRaAAAAQqOTiSjmCFO5turALiPIzvHpfVipA3VIAEV59VDNnLvLpJ1CXZAQ7rbIF3A9ismjhu2KigX3cxc7-fp9vXQBvT1PFiJMsckjSlvFfg3MHe7oM4RQqTG-fDqt6DqBf5QTEhCXROtQlPXd5Xl0sYVToH6rGhTH5pFz-TFqV3VkN3KGI6mvDH0V0w","width":762}],"place_id":"ChIJAVLZmpuoXZQR8YBgsXau15w","rating":4.4,"reference":"CmRbAAAAQM2fY70vcfPc_57VGqi2uVhhmY75okJtMS0A_An1T0BTfk2QL1KeLvmiLDeAnsam24vyBrh0TqUrUUtIQYkmGgvLPH-72_2jTWmJX8MospZSI9DNHy2V3aW2qvuUX5UGEhAWfkHphdKi7mYRbgcQ8SLkGhRqrygjPT86llEMMN0dqT4kIjNwjQ","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"17A St George Wharf, London SW8 2LE, UK","geometry":{"location":{"lat":51.48577659999999,"lng":-0.1251415},"viewport":{"northeast":{"lat":51.48672667989271,"lng":-0.12412155},"southwest":{"lat":51.48402702010727,"lng":-0.12820135}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"87d352d44b7d8be98b5c6a222f8680068bffe0ae","name":"BBVA UK","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108637737821662021650/photos\">BBVA Bank<\/a>"],"photo_reference":"CmRaAAAAN7Gfx5BS7DIRMSlRRjZFYLAHPekTkJ9XrlLh23vQt69_QFOhRJgS35gWqemCTsv73p1DG3m0en7l2AbM8gOAG2K2UwKKmbwHgOUbp4c95JRDOr_ScE0ActqTOMJkWEDBEhB4-NtbW09sbfwmOwalpCWpGhQbzoMbLXePl_MSUs9Pb1HMb7Z_Sg","width":3264}],"place_id":"ChIJBTHpXu4EdkgRsAkR8dEOdaE","rating":3.7,"reference":"CmRbAAAAt4QMOnisJz6WuBI_eT_M4rkt5wuYDoXTFlL3Z-UgVTqteaPpDjYxtgsTEjDZ2EUCn4EiUUKB83LmsspZw7slenVDak1wTgDlIbqga-W-fTslwyVKN0bWlkTpfSbC775aEhD7UZyRcsSvqpSF829aXf5yGhSsV_zgteSaLKlSXTSxoc3Zn3O-1A","types":["bank","atm","finance","point_of_interest","establishment"]},{"formatted_address":"1 Canada Square, Canary Wharf, London E14 5AB, UK","geometry":{"location":{"lat":51.5049489,"lng":-0.0195006},"viewport":{"northeast":{"lat":51.50625027989272,"lng":-0.01770757010727778},"southwest":{"lat":51.50355062010728,"lng":-0.02040722989272221}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"dcf03375b132ecbec11c1421aa19355369d2cea5","name":"B B V A","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJcZAAZbcCdkgRhb_sZetYmhk","rating":3.7,"reference":"CmRbAAAAHIFQcdRUDOsb84VWBpqw06Szhc-5s08Fyt1m0gryq6n7uH7qPIvy0Pl_20vyhvJZYQyesLKDUejgLPlcfGkWr06OtemRZo5UoUaruwsETxurSt2If9O11-ww12sSn6hLEhAMah18C4dyvtyR5dz6l_yZGhQX4P6TNKvUu1U3OxgZu6EzLO3zbQ","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"3060 Wilson Rd SW, Birmingham, AL 35221, USA","geometry":{"location":{"lat":33.4508374,"lng":-86.8892329},"viewport":{"northeast":{"lat":33.45220057989272,"lng":-86.88818042010728},"southwest":{"lat":33.44950092010728,"lng":-86.89088007989272}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"fa584b7f03f6536bf88895f7b071a1da254bf5a2","name":"BBVA Compass","place_id":"ChIJGzy3cTEeiYgRzM_Gm2Nsh3M","reference":"CmRbAAAA9ZjDvHGDsgo43fueguoPWfJOaQo9XsY3zP4BsQM5vtS9xr36un0D1Do0079zx2R27zGoy6cDHJ9rLuPPVD9SyEaloiorvmB8RnE0ioQXxZHyppibpk7F5Cm3RZLoILXzEhB0PsINZkDn1GSOy7bYzRWaGhTNb7PLObiapZZI3eNnKhGOMx1hWQ","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"4919 Flat Shoals Pkwy #475, Decatur, GA 30034, USA","geometry":{"location":{"lat":33.6794044,"lng":-84.22787079999999},"viewport":{"northeast":{"lat":33.68075422989272,"lng":-84.22652097010727},"southwest":{"lat":33.67805457010728,"lng":-84.22922062989272}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"ae5d8576f1275baf783b83efad4ba3fbf356cb4f","name":"BBVA Compass","place_id":"ChIJcdP4pyCr9YgRBp1xR-2oi4Q","rating":1,"reference":"CmRbAAAANcooNQjblbXpEyy4WS6Tvacf0QueqvmScWVzHIx4LkQouuLKqFZ3dzzXV0FPir0y99B6GPAiwE63-pBeTJzWlrRhvhQ2gf_oqAKYJm96kOZy-brhWLKPIJlb-mIo--P6EhAA1mJpKmhjTZeZSquh4It7GhSQ1WgLHw2cueJzxiL9JSY1E_On-g","types":["atm","bank","finance","point_of_interest","establishment"]},{"formatted_address":"2620 SW 19th Avenue Rd, Ocala, FL 34471, USA","geometry":{"location":{"lat":29.1589558,"lng":-82.168324},"viewport":{"northeast":{"lat":29.16053362989272,"lng":-82.16698832010728},"southwest":{"lat":29.15783397010727,"lng":-82.16968797989273}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"c0f1dd355621ee0d2eb0d6d163985afbb1640e53","name":"bbva","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJFzQpzOPU54gRUw8K3IAjQII","reference":"CmRbAAAAp_qBkhO_oQvMt7_PKbj6mibeu7fUIq8gE7UoMa9Sz6EWvwZiQBn-JVWhSw5kQfIC3qFSOorYwVoY-BqhO-HK-1BwleMn37ZGy_OUUHZ8SfLAHzUCgIuznEYLZ0S6DfB9EhDZGUE_xQiZ4czhsazMrTt0GhRilsrgzEC6rHzsnBqNm5XmTdkeMg","types":["bank","finance","point_of_interest","establishment"]},{"formatted_address":"2015 W Martin St, San Antonio, TX 78207, USA","geometry":{"location":{"lat":29.4311826,"lng":-98.5144892},"viewport":{"northeast":{"lat":29.43242797989272,"lng":-98.51315112010728},"southwest":{"lat":29.42972832010728,"lng":-98.51585077989273}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"e4e3604c74370f4eabca9657fd35bbce66ab20a1","name":"Bbva Compass","place_id":"ChIJD7lmoDFfXIYRNmbjwYAQQy8","rating":3,"reference":"CmRbAAAAmHFd_9YIjXZccn6WgxRr6dTPqJIQ56rZOkFR2pjVFeBzPrgLukBhl_5Hfsmlvsk8bnuAmZ038dGWokXG1S4FyAEXhEi5fn0kL46KUAi0q2LKI03DF_Tr-PGNqMho3TuZEhBTTL33_bzuLN18Bqn4SK8yGhR5pMbnECBhQwWMJqpeSJ4VDLxHJQ","types":["bank","finance","school","point_of_interest","establishment"]},{"formatted_address":"1490 Stone Point Dr #250, Roseville, CA 95661, USA","geometry":{"location":{"lat":38.75376850000001,"lng":-121.2482218},"viewport":{"northeast":{"lat":38.75514507989272,"lng":-121.2466591701073},"southwest":{"lat":38.75244542010728,"lng":-121.2493588298927}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"e373f6d361ccfdf9eecc54b704075c4fc9b1b25c","name":"BBVA Compass Loan Production Office (LPO)","place_id":"ChIJCRTsIJMfm4ARkiN0CtUlU8U","reference":"CmRbAAAA8BV3jv4zeWd8TEwEBnsSZp29SgLal1GoEjCCiocc6NbEVVNsqj8yDOi9QOfx3piS9S9IiKXsRtgIfgCmYG5P9152NVhGxiOvcA7azhnKPgLr4rxslKrZ9-UDsRjDWb1REhDRZfrg3ZW3PNs_cWlW3tReGhTjX-U0vujWwX_awqP033xCrKnxbw","types":["finance","point_of_interest","establishment"]},{"formatted_address":"29 Avenue de l'Opéra, 75001 Paris, France","geometry":{"location":{"lat":48.86710679999999,"lng":2.333555},"viewport":{"northeast":{"lat":48.86848097989272,"lng":2.335031079892723},"southwest":{"lat":48.86578132010727,"lng":2.332331420107278}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png","id":"a88f7d93827bd318102e8fa1474522883ca48533","name":"BBVA","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/106565526420354007542/photos\">Banco Bilbao Vizcaya Argentaria<\/a>"],"photo_reference":"CmRaAAAAj-jii_wsMtymryi5KC5T1LR-nlo9RukmC0h5prq1_iQlHJahBkbWTUAWueLkwg6wx0KCZNf4yPPDTUcDp0HKWk-auqSvRBJz7mzmj97V7fOUAmdCZesYhA5eWQxG812WEhBWwXNdkhWH12RkW2_5BSKzGhT8P5PZEHSQG2Mw3QrRCwuj5QrURw","width":3264}],"place_id":"ChIJcc9sADBu5kcR0GvxCz5Lv2w","rating":5,"reference":"CmRbAAAAREBG8K7CxP4HxAfVVPH9iYutHyfGolIa-9yVWz_5q3dDvrUA2pNhw9qruk4JhiyZGSMdIp7CuS0WdyTOJscqDfJdqgbOJnGvz98dKCVGqfJgXlY2bpQUQ9IFmK7N5EREEhBymsPu0ZV8u5I5Pp-ozIAlGhQzarHbjABVJ7wpzBqbEjkcMofFjg","types":["bank","atm","finance","point_of_interest","establishment"]}]
     * status : OK
     */

    private String next_page_token;
    private String status;
    private List<?> html_attributions;
    private List<ResultsBean> results;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean implements Serializable{
        /**
         * formatted_address : 3711 S Taylor Dr, Sheboygan, WI 53081, USA
         * geometry : {"location":{"lat":43.71496,"lng":-87.75447},"viewport":{"northeast":{"lat":43.71630982989272,"lng":-87.75312017010728},"southwest":{"lat":43.71361017010727,"lng":-87.75581982989273}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/bank_dollar-71.png
         * id : f340dde8ca8f7ecbd1342ca47cc7088e96a492b7
         * name : BBVA Compass
         * place_id : ChIJF__3h8GmBIgRJSUU9lB6SYQ
         * reference : CmRbAAAAm1qx4FPagEt3bXO7qsZXMc3NllTrUgSIqYiH-H2oOimz5jaFD9f6cyFm-pimoibAZ-NbyNeW6EzFFIXYBZEzQ4H_RtIQSTfa0uMJ95fVSpYieQlVWuwxqbU-_KB4moWkEhAAs2FUTuF0kGpI08iTYH5dGhRMriMRXuTghiNAfs9UGQAp2AZ88Q
         * types : ["bank","atm","finance","point_of_interest","establishment"]
         * opening_hours : {"open_now":true,"weekday_text":[]}
         * rating : 3.7
         * photos : [{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108923346478590255553/photos\">BBVA Brussels<\/a>"],"photo_reference":"CmRaAAAA4mqM9lGEIZXKGAL6BZc08918T_NHeKas23gZIBLh6Qh1LCoMER-KaNlcY1SFYewgB7IwjARRT_h_e_O-Zvqy2l71X84uGHfMIAicIEOGOj7b9kixfe0EVA0GawA059rFEhBxa6VWZzXPRYtjbi_1wt4lGhROE6b7luQfVkZGFSuYdJrErDXVIQ","width":3264}]
         */

        private String formatted_address;
        private GeometryBean geometry;
        private String icon;
        private String id;
        private String name;
        private String place_id;
        private String reference;
        private OpeningHoursBean opening_hours;
        private double rating;
        private List<String> types;
        private List<PhotosBean> photos;

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }



        public static class GeometryBean {
            /**
             * location : {"lat":43.71496,"lng":-87.75447}
             * viewport : {"northeast":{"lat":43.71630982989272,"lng":-87.75312017010728},"southwest":{"lat":43.71361017010727,"lng":-87.75581982989273}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class LocationBean {
                /**
                 * lat : 43.71496
                 * lng : -87.75447
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class ViewportBean {
                /**
                 * northeast : {"lat":43.71630982989272,"lng":-87.75312017010728}
                 * southwest : {"lat":43.71361017010727,"lng":-87.75581982989273}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    /**
                     * lat : 43.71630982989272
                     * lng : -87.75312017010728
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    /**
                     * lat : 43.71361017010727
                     * lng : -87.75581982989273
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHoursBean {
            /**
             * open_now : true
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }

        public static class PhotosBean {
            /**
             * height : 1836
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/108923346478590255553/photos\">BBVA Brussels<\/a>"]
             * photo_reference : CmRaAAAA4mqM9lGEIZXKGAL6BZc08918T_NHeKas23gZIBLh6Qh1LCoMER-KaNlcY1SFYewgB7IwjARRT_h_e_O-Zvqy2l71X84uGHfMIAicIEOGOj7b9kixfe0EVA0GawA059rFEhBxa6VWZzXPRYtjbi_1wt4lGhROE6b7luQfVkZGFSuYdJrErDXVIQ
             * width : 3264
             */

            private int height;
            private String photo_reference;
            private int width;
            private List<String> html_attributions;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhoto_reference() {
                return photo_reference;
            }

            public void setPhoto_reference(String photo_reference) {
                this.photo_reference = photo_reference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtml_attributions() {
                return html_attributions;
            }

            public void setHtml_attributions(List<String> html_attributions) {
                this.html_attributions = html_attributions;
            }
        }
    }
}
