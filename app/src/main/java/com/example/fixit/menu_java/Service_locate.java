package com.example.fixit.menu_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.fixit.R;

public class Service_locate extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_locate);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //Tatarstan
            case R.id.almetyevsk_web:
                Intent almetyevsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.alphaservis.ru/"));
                startActivity(almetyevsk);
                break;
            case R.id.almetyevsk_map:
                Intent adress = new Intent();
                adress.setAction(Intent.ACTION_VIEW);
                adress.setData(Uri.parse("geo:54.890257, 52.307893"));
                startActivity(adress);
                break;
            case R.id.nizhnekamsk_web:
                Intent nizhnekamsk_web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.drovosek-nk.ru/"));
                startActivity(nizhnekamsk_web);
                break;
            case R.id.nizhnekamsk_map:
                Intent nizhnekamsk = new Intent();
                nizhnekamsk.setAction(Intent.ACTION_VIEW);
                nizhnekamsk.setData(Uri.parse("geo:55.636300, 51.810864"));
                startActivity(nizhnekamsk);
                break;
            case (R.id.nizhnekamsk_number):
                Intent nizhnekamsk_number = new Intent(Intent.ACTION_DIAL);
                nizhnekamsk_number.setData(Uri.parse("tel:+7 987-260-23-81"));
                startActivity(nizhnekamsk_number);
                break;
            case R.id.kazan_map2:
                Intent adress23 = new Intent();
                adress23.setAction(Intent.ACTION_VIEW);
                adress23.setData(Uri.parse("geo:55.744617, 49.133148"));
                startActivity(adress23);
                break;
            case (R.id.almetyevsk_number):
                Intent number = new Intent(Intent.ACTION_DIAL);
                number.setData(Uri.parse("tel:+7 917234 4 888"));
                startActivity(number);
                break;
            case (R.id.almetyevsk_number2):
                Intent number2 = new Intent(Intent.ACTION_DIAL);
                number2.setData(Uri.parse("tel:+7917 87 333 77"));
                startActivity(number2);
                break;
            case (R.id.kazan_number3):
                Intent number3 = new Intent(Intent.ACTION_DIAL);
                number3.setData(Uri.parse("tel:+7 (965) 583-70-86"));
                startActivity(number3);
                break;
                //Archangelsk
            case R.id.archangel_web:
                Intent archangel = new Intent(Intent.ACTION_VIEW, Uri.parse("https://severs.ru/"));
                startActivity(archangel);
                break;
            case R.id.archangel_map:
                Intent adress2 = new Intent();
                adress2.setAction(Intent.ACTION_VIEW);
                adress2.setData(Uri.parse("geo:64.566917, 40.587466"));
                startActivity(adress2);
                break;
            case (R.id.archangel_number):
                Intent number_archangel = new Intent(Intent.ACTION_DIAL);
                number_archangel.setData(Uri.parse("tel:+7 (8182) 29-77-38"));
                startActivity(number_archangel);
                break;
            case (R.id.archangel_number2):
                Intent number2_archangel = new Intent(Intent.ACTION_DIAL);
                number2_archangel.setData(Uri.parse("tel:+7 (8182) 29-77-39"));
                startActivity(number2_archangel);
                break;
                //Astrahan
            case R.id.astrahan_map:
                Intent adress_astrahan = new Intent();
                adress_astrahan.setAction(Intent.ACTION_VIEW);
                adress_astrahan.setData(Uri.parse("geo:46.352230, 48.080340"));
                startActivity(adress_astrahan);
                break;
            case (R.id.astrahan_number):
                Intent number_astrahan = new Intent(Intent.ACTION_DIAL);
                number_astrahan.setData(Uri.parse("tel:+7 (8512) 450063"));
                startActivity(number_astrahan);
                break;
            case (R.id.astrahan_number2):
                Intent number2_astrahan = new Intent(Intent.ACTION_DIAL);
                number2_astrahan.setData(Uri.parse("tel:+7 (8512) 450066"));
                startActivity(number2_astrahan);
                break;
                //Altay
            case R.id.altay_web:
                Intent altay = new Intent(Intent.ACTION_VIEW, Uri.parse("https://svarcenter22.ru"));
                startActivity(altay);
                break;
            case R.id.altay_map:
                Intent adress_altay = new Intent();
                adress_altay.setAction(Intent.ACTION_VIEW);
                adress_altay.setData(Uri.parse("geo:53.342065, 83.750689"));
                startActivity(adress_altay);
                break;
            case R.id.altay_map3:
                Intent adress_altay3 = new Intent();
                adress_altay3.setAction(Intent.ACTION_VIEW);
                adress_altay3.setData(Uri.parse("geo:52.524429, 85.130725"));
                startActivity(adress_altay3);
                break;
            case (R.id.altay_number):
                Intent number_altay = new Intent(Intent.ACTION_DIAL);
                number_altay.setData(Uri.parse("tel:8 (493) 257-48-08"));
                startActivity(number_altay);
                break;
            case (R.id.altay_number5):
                Intent number_altay3 = new Intent(Intent.ACTION_DIAL);
                number_altay3.setData(Uri.parse("tel:8 (3852) 539-503"));
                startActivity(number_altay3);
                break;
            case (R.id.altay_number2):
                Intent number2_altay = new Intent(Intent.ACTION_DIAL);
                number2_altay.setData(Uri.parse("tel:8-913-250-11-23"));
                startActivity(number2_altay);
                break;
                //Belgorod
            case R.id.belgorod_web:
                Intent belgorod = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.artisan31.ru/"));
                startActivity(belgorod);
                break;
            case R.id.belgorod_map:
                Intent adress_belgorod = new Intent();
                adress_belgorod.setAction(Intent.ACTION_VIEW);
                adress_belgorod.setData(Uri.parse("geo:50.590376, 36.626362"));
                startActivity(adress_belgorod);
                break;
            case (R.id.belgorod_number):
                Intent number_belgorod = new Intent(Intent.ACTION_DIAL);
                number_belgorod.setData(Uri.parse("tel:+7 (4722) 56-95-77"));
                startActivity(number_belgorod);
                break;
            case (R.id.belgorod_number2):
                Intent number2_belgorod = new Intent(Intent.ACTION_DIAL);
                number2_belgorod.setData(Uri.parse("tel::+7 (4722) 56-95-73"));
                startActivity(number2_belgorod);
                break;
                //Bryansk
            case R.id.bryansk_web:
                Intent bryansk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.svarmaster24.ru/"));
                startActivity(bryansk);
                break;
            case R.id.bryansk_map:
                Intent adress_bryansk = new Intent();
                adress_bryansk.setAction(Intent.ACTION_VIEW);
                adress_bryansk.setData(Uri.parse("geo:53.302860, 34.267719"));
                startActivity(adress_bryansk);
                break;
            case (R.id.bryansk_number2):
                Intent number_bryansk = new Intent(Intent.ACTION_DIAL);
                number_bryansk.setData(Uri.parse("tel:+7 (4832) 77-2000"));
                startActivity(number_bryansk);
                break;
                //vladivostok
            case R.id.vladivostok_web:
                Intent vladivostok = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ew.center/"));
                startActivity(vladivostok);
                break;
            case R.id.vladivostok_map:
                Intent adress_vladivostok = new Intent();
                adress_vladivostok.setAction(Intent.ACTION_VIEW);
                adress_vladivostok.setData(Uri.parse("geo:43.137131, 131.953595"));
                startActivity(adress_vladivostok);
                break;
            case (R.id.vladivostok_number2):
                Intent number2_vladivostok = new Intent(Intent.ACTION_DIAL);
                number2_vladivostok.setData(Uri.parse("tel:+7 (423) 280-53-27"));
                startActivity(number2_vladivostok);
                break;
                //Vladimir
            case R.id.vladimir_web:
                Intent vladimir = new Intent(Intent.ACTION_VIEW, Uri.parse("http://master-svarschik.ru/"));
                startActivity(vladimir);
                break;
            case R.id.vladimir_map:
                Intent adress_vladimir = new Intent();
                adress_vladimir.setAction(Intent.ACTION_VIEW);
                adress_vladimir.setData(Uri.parse("geo:56.150153, 40.378068"));
                startActivity(adress_vladimir);
                break;
            case (R.id.vladimir_number2):
                Intent number2_vladimir = new Intent(Intent.ACTION_DIAL);
                number2_vladimir.setData(Uri.parse("tel:+7 (910) 098-13-45"));
                startActivity(number2_vladimir);
                break;
                //volgograd
            case R.id.volgograd_web:
                Intent volgograd = new Intent(Intent.ACTION_VIEW, Uri.parse("http://specservis.ru/"));
                startActivity(volgograd);
                break;
            case R.id.volgograd_map:
                Intent adress_volgograd = new Intent();
                adress_volgograd.setAction(Intent.ACTION_VIEW);
                adress_volgograd.setData(Uri.parse("geo:48.523862, 44.575743"));
                startActivity(adress_volgograd);
                break;
            case (R.id.volgograd_number2):
                Intent number2_volgograd = new Intent(Intent.ACTION_DIAL);
                number2_volgograd.setData(Uri.parse("tel:+7(8442) 49 89 90"));
                startActivity(number2_volgograd);
                break;
                //voronezh
            case R.id.voronezh_web:
                Intent voronezh = new Intent(Intent.ACTION_VIEW, Uri.parse("http://msvar.ru/"));
                startActivity(voronezh);
                break;
            case R.id.voronezh_map:
                Intent adress_voronezh = new Intent();
                adress_voronezh.setAction(Intent.ACTION_VIEW);
                adress_voronezh.setData(Uri.parse("geo:51.697907, 39.270311"));
                startActivity(adress_voronezh);
                break;
            case (R.id.voronezh_number2):
                Intent number2_voronezh = new Intent(Intent.ACTION_DIAL);
                number2_voronezh.setData(Uri.parse("tel:8(473)229-40-99"));
                startActivity(number2_voronezh);
                break;
                //dzerzhinsk
            case R.id.dzerzhinsk_web:
                Intent dzerzhinsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.texas-servis.ru/"));
                startActivity(dzerzhinsk);
                break;
            case R.id.dzerzhinsk_map:
                Intent adress_dzerzhinsk = new Intent();
                adress_dzerzhinsk.setAction(Intent.ACTION_VIEW);
                adress_dzerzhinsk.setData(Uri.parse("geo:56.229571, 43.388898"));
                startActivity(adress_dzerzhinsk);
                break;
            case (R.id.dzerzhinsk_number2):
                Intent number2_dzerzhinsk = new Intent(Intent.ACTION_DIAL);
                number2_dzerzhinsk.setData(Uri.parse("tel:+7 (920)049-43-28"));
                startActivity(number2_dzerzhinsk);
                break;
                //nizhniy
            case R.id.nizhniy_web:
                Intent nizhniy = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.grovers.ru/"));
                startActivity(nizhniy);
                break;
            case R.id.nizhniy_map:
                Intent adress_nizhniy = new Intent();
                adress_nizhniy.setAction(Intent.ACTION_VIEW);
                adress_nizhniy.setData(Uri.parse("geo:56.314976, 44.033879"));
                startActivity(adress_nizhniy);
                break;
            case (R.id.nizhniy_number2):
                Intent number2_nizhniy = new Intent(Intent.ACTION_DIAL);
                number2_nizhniy.setData(Uri.parse("tel:+7 (831) 2-808-333"));
                startActivity(number2_nizhniy);
                break;
                //ekaterinburg
            case R.id.ekaterinburg_web:
                Intent ekaterinburg = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.invert-service.ru/"));
                startActivity(ekaterinburg);
                break;
            case R.id.ekaterinburg_map:
                Intent adress_ekaterinburg = new Intent();
                adress_ekaterinburg.setAction(Intent.ACTION_VIEW);
                adress_ekaterinburg.setData(Uri.parse("geo:56.856968, 60.579706"));
                startActivity(adress_ekaterinburg);
                break;
            case (R.id.ekaterinburg_number2):
                Intent number2_ekaterinburg = new Intent(Intent.ACTION_DIAL);
                number2_ekaterinburg.setData(Uri.parse("tel:8-950-631-78-34"));
                startActivity(number2_ekaterinburg);
                break;
                //ivanovo
            case R.id.ivanovo_map:
                Intent adress_ivanovo = new Intent();
                adress_ivanovo.setAction(Intent.ACTION_VIEW);
                adress_ivanovo.setData(Uri.parse("geo:57.017982, 40.966420"));
                startActivity(adress_ivanovo);
                break;
            case (R.id.ivanovo_number2):
                Intent number2_ivanovo = new Intent(Intent.ACTION_DIAL);
                number2_ivanovo.setData(Uri.parse("tel:+7 (962) 159-23-93"));
                startActivity(number2_ivanovo);
                break;
                //izhevsk
            case R.id.izhevsk_web:
                Intent izhevsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.raden.su/"));
                startActivity(izhevsk);
                break;
            case R.id.izhevsk_map:
                Intent adress_izhevsk = new Intent();
                adress_izhevsk.setAction(Intent.ACTION_VIEW);
                adress_izhevsk.setData(Uri.parse("geo:56.822577, 53.198833"));
                startActivity(adress_izhevsk);
                break;
            case (R.id.izhevsk_number2):
                Intent number2_izhevsk = new Intent(Intent.ACTION_DIAL);
                number2_izhevsk.setData(Uri.parse("tel:8(3412)655-295"));
                startActivity(number2_izhevsk);
                break;
                //irkutsk
            case R.id.irkutsk_web:
                Intent irkutsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.welda.ru/"));
                startActivity(irkutsk);
                break;
            case R.id.irkutsk_map:
                Intent adress_irkutsk = new Intent();
                adress_irkutsk.setAction(Intent.ACTION_VIEW);
                adress_irkutsk.setData(Uri.parse("geo:52.320689, 104.240811"));
                startActivity(adress_irkutsk);
                break;
            case (R.id.irkutsk_number2):
                Intent number2_irkutsk = new Intent(Intent.ACTION_DIAL);
                number2_irkutsk.setData(Uri.parse("tel:+7 (3952) 55-00-52"));
                startActivity(number2_irkutsk);
                break;
                //kaliningrad
            case R.id.kaliningrad_web:
                Intent kaliningrad = new Intent(Intent.ACTION_VIEW, Uri.parse("http://weld-expert.com/"));
                startActivity(kaliningrad);
                break;
            case R.id.kaliningrad_map:
                Intent adress_kaliningrad = new Intent();
                adress_kaliningrad.setAction(Intent.ACTION_VIEW);
                adress_kaliningrad.setData(Uri.parse("geo:54.681680, 20.532155"));
                startActivity(adress_kaliningrad);
                break;
            case (R.id.kaliningrad_number2):
                Intent number2_kaliningrad = new Intent(Intent.ACTION_DIAL);
                number2_kaliningrad.setData(Uri.parse("tel:8 (4012) 50-85-11"));
                startActivity(number2_kaliningrad);
                break;
                //kaluga
            case R.id.kaluga_web:
                Intent kaluga = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.svarmaster24.ru/"));
                startActivity(kaluga);
                break;
            case R.id.kaluga_map:
                Intent adress_kaluga = new Intent();
                adress_kaluga.setAction(Intent.ACTION_VIEW);
                adress_kaluga.setData(Uri.parse("geo:54.516819, 36.262203"));
                startActivity(adress_kaluga);
                break;
            case (R.id.kaluga_number2):
                Intent number2_kaluga = new Intent(Intent.ACTION_DIAL);
                number2_kaluga.setData(Uri.parse("tel:+7(915) 537 72 21"));
                startActivity(number2_kaluga);
                break;
                //kirov
            case R.id.kirov_web:
                Intent kirov = new Intent(Intent.ACTION_VIEW, Uri.parse("http://promweld.ru/"));
                startActivity(kirov);
                break;
            case R.id.kirov_map:
                Intent adress_kirov = new Intent();
                adress_kirov.setAction(Intent.ACTION_VIEW);
                adress_kirov.setData(Uri.parse("geo:58.574689, 49.609156"));
                startActivity(adress_kirov);
                break;
            case (R.id.kirov_number2):
                Intent number2_kirov = new Intent(Intent.ACTION_DIAL);
                number2_kirov.setData(Uri.parse("tel:+7(8332) 714-555"));
                startActivity(number2_kirov);
                break;
                //kolomna
            case R.id.kolomna_map:
                Intent adress_kolomna = new Intent();
                adress_kolomna.setAction(Intent.ACTION_VIEW);
                adress_kolomna.setData(Uri.parse("geo:55.084353, 38.731986"));
                startActivity(adress_kolomna);
                break;
            case (R.id.kolomna_number2):
                Intent number2_kolomna = new Intent(Intent.ACTION_DIAL);
                number2_kolomna.setData(Uri.parse("tel:+7 (916) 580-45-80"));
                startActivity(number2_kolomna);
                break;
            case R.id.kursk_web:
                Intent kursk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iqtool.ru/"));
                startActivity(kursk);
                break;
            case R.id.kursk_map:
                Intent adress_kursk = new Intent();
                adress_kursk.setAction(Intent.ACTION_VIEW);
                adress_kursk.setData(Uri.parse("geo:51.702489, 36.167925"));
                startActivity(adress_kursk);
                break;
            case (R.id.kursk_number2):
                Intent number2_kursk = new Intent(Intent.ACTION_DIAL);
                number2_kursk.setData(Uri.parse("tel:+7 (4712) 777-203"));
                startActivity(number2_kursk);
                break;
            case R.id.moscow_web:
                Intent moscow = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.svarbi.ru/"));
                startActivity(moscow);
                break;
            case R.id.moscow_map:
                Intent adress_moscow = new Intent();
                adress_moscow.setAction(Intent.ACTION_VIEW);
                adress_moscow.setData(Uri.parse("geo:55.614338, 37.619423"));
                startActivity(adress_moscow);
                break;
            case (R.id.moscow_number2):
                Intent number2_moscow = new Intent(Intent.ACTION_DIAL);
                number2_moscow.setData(Uri.parse("tel:+7(495) 77-55-830"));
                startActivity(number2_moscow);
                break;
                //krasnodar
            case R.id.krasnodar_web:
                Intent krasnodar = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.weldingservice.net/"));
                startActivity(krasnodar);
                break;
            case R.id.krasnodar_map:
                Intent adress_krasnodar = new Intent();
                adress_krasnodar.setAction(Intent.ACTION_VIEW);
                adress_krasnodar.setData(Uri.parse("geo:45.074890, 38.988105"));
                startActivity(adress_krasnodar);
                break;
            case (R.id.krasnodar_number2):
                Intent number2_krasnodar = new Intent(Intent.ACTION_DIAL);
                number2_krasnodar.setData(Uri.parse("tel:+7 (918) 2678717"));
                startActivity(number2_krasnodar);
                break;
            case R.id.krasnodar2_map:
                Intent adress_krasnodar2 = new Intent();
                adress_krasnodar2.setAction(Intent.ACTION_VIEW);
                adress_krasnodar2.setData(Uri.parse("geo:45.145638, 38.995310"));
                startActivity(adress_krasnodar2);
                break;
            case (R.id.krasnodar2_number2):
                Intent number2_krasnodar2 = new Intent(Intent.ACTION_DIAL);
                number2_krasnodar2.setData(Uri.parse("tel:+7(918) 1989858"));
                startActivity(number2_krasnodar2);
                break;
                //krasnoyarsk
            case R.id.krasnoyarsk_web:
                Intent krasnoyarsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kontinent124.ru/"));
                startActivity(krasnoyarsk);
                break;
            case R.id.krasnoyarsk_map:
                Intent adress_krasnoyarsk = new Intent();
                adress_krasnoyarsk.setAction(Intent.ACTION_VIEW);
                adress_krasnoyarsk.setData(Uri.parse("geo:56.041169, 92.871113"));
                startActivity(adress_krasnoyarsk);
                break;
            case (R.id.krasnoyarsk_number2):
                Intent number2_krasnoyarsk = new Intent(Intent.ACTION_DIAL);
                number2_krasnoyarsk.setData(Uri.parse("tel:+7(391) 214-68-39"));
                startActivity(number2_krasnoyarsk);
                break;
            case R.id.krasnoyarsk2_web:
                Intent krasnoyarsk2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.service.iws24.ru/"));
                startActivity(krasnoyarsk2);
                break;
            case R.id.krasnoyarsk2_map:
                Intent adress_krasnoyarsk2 = new Intent();
                adress_krasnoyarsk2.setAction(Intent.ACTION_VIEW);
                adress_krasnoyarsk2.setData(Uri.parse("geo:55.995609, 92.950120"));
                startActivity(adress_krasnoyarsk2);
                break;
            case (R.id.krasnoyarsk2_number2):
                Intent number2_krasnoyarsk2 = new Intent(Intent.ACTION_DIAL);
                number2_krasnoyarsk2.setData(Uri.parse("tel:+7(391) 228-74-67"));
                startActivity(number2_krasnoyarsk2);
                break;
                //yakutiya
            case R.id.yakutiya_web:
                Intent yakutiya = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/technosvet_neru?r=nametag"));
                startActivity(yakutiya);
                break;
            case R.id.yakutiya_map:
                Intent adress_yakutiya = new Intent();
                adress_yakutiya.setAction(Intent.ACTION_VIEW);
                adress_yakutiya.setData(Uri.parse("geo:56.658657, 124.699178"));
                startActivity(adress_yakutiya);
                break;
            case (R.id.yakutiya_number2):
                Intent number2_yakutiya = new Intent(Intent.ACTION_DIAL);
                number2_yakutiya.setData(Uri.parse("tel:+7(924) 161-66-39"));
                startActivity(number2_yakutiya);
                break;
                // novokuznetzk
            case R.id.novokuznetzk_web:
                Intent novokuznetzk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://svarteh-servis.ru/"));
                startActivity(novokuznetzk);
                break;
            case R.id.novokuznetzk_map:
                Intent adress_novokuznetzk = new Intent();
                adress_novokuznetzk.setAction(Intent.ACTION_VIEW);
                adress_novokuznetzk.setData(Uri.parse("geo:53.785422, 87.222992"));
                startActivity(adress_novokuznetzk);
                break;
            case (R.id.novokuznetzk_number2):
                Intent number2_novokuznetzk = new Intent(Intent.ACTION_DIAL);
                number2_novokuznetzk.setData(Uri.parse("tel:+7 (3843) 75-62-99"));
                startActivity(number2_novokuznetzk);
                break;
                //novosibirsk
            case R.id.novosibirsk_web:
                Intent novosibirsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.remont.profsvarka.net/"));
                startActivity(novosibirsk);
                break;
            case R.id.novosibirsk_map:
                Intent adress_novosibirsk = new Intent();
                adress_novosibirsk.setAction(Intent.ACTION_VIEW);
                adress_novosibirsk.setData(Uri.parse("geo:55.014809, 82.918085"));
                startActivity(adress_novosibirsk);
                break;
            case (R.id.novosibirsk_number2):
                Intent number2_novosibirsk = new Intent(Intent.ACTION_DIAL);
                number2_novosibirsk.setData(Uri.parse("tel:+7(924) 161-66-39"));
                startActivity(number2_novosibirsk);
                break;
            case R.id.novosibirsk2_web:
                Intent novosibirsk2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.weld-service.ru/"));
                startActivity(novosibirsk2);
                break;
            case R.id.novosibirsk2_map:
                Intent adress_novosibirsk2 = new Intent();
                adress_novosibirsk2.setAction(Intent.ACTION_VIEW);
                adress_novosibirsk2.setData(Uri.parse("geo:54.945567, 82.910620"));
                startActivity(adress_novosibirsk2);
                break;
            case (R.id.novosibirsk2_number2):
                Intent number2_novosibirsk2 = new Intent(Intent.ACTION_DIAL);
                number2_novosibirsk2.setData(Uri.parse("tel:8 (383) 258-37-11"));
                startActivity(number2_novosibirsk2);
                break;
                //omsk
            case R.id.omsk_web:
                Intent omsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://armig.ru/"));
                startActivity(omsk);
                break;
            case R.id.omsk_map:
                Intent adress_omsk = new Intent();
                adress_omsk.setAction(Intent.ACTION_VIEW);
                adress_omsk.setData(Uri.parse("geo:54.989259, 73.461017"));
                startActivity(adress_omsk);
                break;
            case (R.id.omsk_number2):
                Intent number2_omsk = new Intent(Intent.ACTION_DIAL);
                number2_omsk.setData(Uri.parse("tel:8 (3812) 788056"));
                startActivity(number2_omsk);
                break;
                //orenburg
            case R.id.orenburg_web:
                Intent orenburg = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rezerv56.ru/"));
                startActivity(orenburg);
                break;
            case R.id.orenburg_map:
                Intent adress_orenburg = new Intent();
                adress_orenburg.setAction(Intent.ACTION_VIEW);
                adress_orenburg.setData(Uri.parse("geo:51.722886, 55.126303"));
                startActivity(adress_orenburg);
                break;
            case (R.id.orenburg_number2):
                Intent number2_orenburg = new Intent(Intent.ACTION_DIAL);
                number2_orenburg.setData(Uri.parse("tel:8(3532)505-670"));
                startActivity(number2_orenburg);
                break;
                //penza
            case R.id.penza_web:
                Intent penza = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mogu-vse.ru/"));
                startActivity(penza);
                break;
            case R.id.penza_map:
                Intent adress_penza = new Intent();
                adress_penza.setAction(Intent.ACTION_VIEW);
                adress_penza.setData(Uri.parse("geo:51.781200, 55.128971"));
                startActivity(adress_penza);
                break;
            case (R.id.penza_number2):
                Intent number2_penza = new Intent(Intent.ACTION_DIAL);
                number2_penza.setData(Uri.parse("tel:8-800-550-36-03"));
                startActivity(number2_penza);
                break;
                //perm
            case R.id.perm_web:
                Intent perm = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mogu-vse.ru/"));
                startActivity(perm);
                break;
            case R.id.perm_map:
                Intent adress_perm = new Intent();
                adress_perm.setAction(Intent.ACTION_VIEW);
                adress_perm.setData(Uri.parse("geo:57.951646, 56.248173"));
                startActivity(adress_perm);
                break;
            case (R.id.perm_number2):
                Intent number2_perm = new Intent(Intent.ACTION_DIAL);
                number2_perm.setData(Uri.parse("tel:+7 (342) 294-44-36"));
                startActivity(number2_perm);
                break;
                //petrozavodsk
            case R.id.petrozavodsk_web:
                Intent petrozavodsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.svarkomptz.ru/"));
                startActivity(petrozavodsk);
                break;
            case R.id.petrozavodsk_map:
                Intent adress_petrozavodsk = new Intent();
                adress_petrozavodsk.setAction(Intent.ACTION_VIEW);
                adress_petrozavodsk.setData(Uri.parse("geo:61.807718, 34.281068"));
                startActivity(adress_petrozavodsk);
                break;
            case (R.id.petrozavodsk_number2):
                Intent number2_petrozavodsk = new Intent(Intent.ACTION_DIAL);
                number2_petrozavodsk.setData(Uri.parse("tel:8 (911) 400-46-11"));
                startActivity(number2_petrozavodsk);
                break;
                //rostov_na_dony

            case R.id.rostov_na_dony_map:
                Intent adress_rostov_na_dony = new Intent();
                adress_rostov_na_dony.setAction(Intent.ACTION_VIEW);
                adress_rostov_na_dony.setData(Uri.parse("geo:47.239480, 39.823736"));
                startActivity(adress_rostov_na_dony);
                break;
            case (R.id.rostov_na_dony_number2):
                Intent number2_rostov_na_dony = new Intent(Intent.ACTION_DIAL);
                number2_rostov_na_dony.setData(Uri.parse("tel:+7 (863) 279-69-59"));
                startActivity(number2_rostov_na_dony);
                break;
                //ryazan

            case R.id.ryazan_map:
                Intent adress_ryazan = new Intent();
                adress_ryazan.setAction(Intent.ACTION_VIEW);
                adress_ryazan.setData(Uri.parse("geo:54.624150, 39.768948"));
                startActivity(adress_ryazan);
                break;
            case (R.id.ryazan_number2):
                Intent number2_ryazan = new Intent(Intent.ACTION_DIAL);
                number2_ryazan.setData(Uri.parse("tel:+7(910)502-21-21"));
                startActivity(number2_ryazan);
                break;
                //peterburg
            case R.id.peterburg_web:
                Intent peterburg = new Intent(Intent.ACTION_VIEW, Uri.parse("http://svarka.deria.ru/"));
                startActivity(peterburg);
                break;
            case R.id.peterburg_map:
                Intent adress_peterburg = new Intent();
                adress_peterburg.setAction(Intent.ACTION_VIEW);
                adress_peterburg.setData(Uri.parse("geo:59.891611, 30.260280"));
                startActivity(adress_peterburg);
                break;
            case (R.id.peterburg_number2):
                Intent number2_peterburg = new Intent(Intent.ACTION_DIAL);
                number2_peterburg.setData(Uri.parse("tel:8 800 775-09-69"));
                startActivity(number2_peterburg);
                break;
            case R.id.peterburg2_map:
                Intent adress_peterburg2 = new Intent();
                adress_peterburg2.setAction(Intent.ACTION_VIEW);
                adress_peterburg2.setData(Uri.parse("geo:59.954151, 30.261781"));
                startActivity(adress_peterburg2);
                break;
            case (R.id.peterburg2_number2):
                Intent number2_peterburg2 = new Intent(Intent.ACTION_DIAL);
                number2_peterburg2.setData(Uri.parse("tel:+7 (921) 449 84 29"));
                startActivity(number2_peterburg2);
                break;
            case R.id.peterburg3_map:
                Intent adress_peterburg3 = new Intent();
                adress_peterburg3.setAction(Intent.ACTION_VIEW);
                adress_peterburg3.setData(Uri.parse("geo:60.021946, 30.392620"));
                startActivity(adress_peterburg3);
                break;
            case (R.id.peterburg3_number2):
                Intent number2_peterburg3 = new Intent(Intent.ACTION_DIAL);
                number2_peterburg3.setData(Uri.parse("tel:+7 (812) 900-38-91"));
                startActivity(number2_peterburg3);
                break;
                //saratov
            case R.id.saratov_web:
                Intent saratov = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.svarka-service.com/"));
                startActivity(saratov);
                break;
            case R.id.saratov_map:
                Intent adress_saratov = new Intent();
                adress_saratov.setAction(Intent.ACTION_VIEW);
                adress_saratov.setData(Uri.parse("geo:51.547572, 46.011547"));
                startActivity(adress_saratov);
                break;
            case (R.id.saratov_number2):
                Intent number2_saratov = new Intent(Intent.ACTION_DIAL);
                number2_saratov.setData(Uri.parse("tel:+7 (8452) 46-01-04"));
                startActivity(number2_saratov);
                break;
                //simferopol
            case R.id.simferopol_web:
                Intent simferopol = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.oootavr.ru/"));
                startActivity(simferopol);
                break;
            case R.id.simferopol_map:
                Intent adress_simferopol = new Intent();
                adress_simferopol.setAction(Intent.ACTION_VIEW);
                adress_simferopol.setData(Uri.parse("geo:44.942547, 34.068931"));
                startActivity(adress_simferopol);
                break;
            case (R.id.simferopol_number2):
                Intent number2_simferopol = new Intent(Intent.ACTION_DIAL);
                number2_simferopol.setData(Uri.parse("tel:+7 (3652) 53-41-55"));
                startActivity(number2_simferopol);
                break;
                //stavropol

            case R.id.stavropol_map:
                Intent adress_stavropol = new Intent();
                adress_stavropol.setAction(Intent.ACTION_VIEW);
                adress_stavropol.setData(Uri.parse("geo:45.008094, 41.907145"));
                startActivity(adress_stavropol);
                break;
            case (R.id.stavropol_number2):
                Intent number2_stavropol = new Intent(Intent.ACTION_DIAL);
                number2_stavropol.setData(Uri.parse("tel:8 (962) 442-40-19"));
                startActivity(number2_stavropol);
                break;
                //tula
            case R.id.tula_web:
                Intent tula = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.svarkacentr.ru/"));
                startActivity(tula);
                break;
            case R.id.tula_map:
                Intent adress_tula = new Intent();
                adress_tula.setAction(Intent.ACTION_VIEW);
                adress_tula.setData(Uri.parse("geo:54.161472, 37.583948"));
                startActivity(adress_tula);
                break;
            case (R.id.tula_number2):
                Intent number2_tula = new Intent(Intent.ACTION_DIAL);
                number2_tula.setData(Uri.parse("tel:+7(4872)35-45-87"));
                startActivity(number2_tula);
                break;
                //ulyanovsk
            case R.id.ulyanovsk_map:
                Intent adress_ulyanovsk = new Intent();
                adress_ulyanovsk.setAction(Intent.ACTION_VIEW);
                adress_ulyanovsk.setData(Uri.parse("geo:54.295841, 48.322032"));
                startActivity(adress_ulyanovsk);
                break;
            case (R.id.ulyanovsk_number2):
                Intent number2_ulyanovsk = new Intent(Intent.ACTION_DIAL);
                number2_ulyanovsk.setData(Uri.parse("tel:+7 (8422) 73-64-08"));
                startActivity(number2_ulyanovsk);
                break;
                //ufa
            case R.id.ufa_map:
                Intent adress_ufa = new Intent();
                adress_ufa.setAction(Intent.ACTION_VIEW);
                adress_ufa.setData(Uri.parse("geo:54.750754, 56.026191"));
                startActivity(adress_ufa);
                break;
            case (R.id.ufa_number2):
                Intent number2_ufa = new Intent(Intent.ACTION_DIAL);
                number2_ufa.setData(Uri.parse("tel:+7(347) 295-99-28"));
                startActivity(number2_ufa);
                break;
                //cheboksari
            case R.id.cheboksari_web:
                Intent cheboksari = new Intent(Intent.ACTION_VIEW, Uri.parse("http://center-svarki21.ru/"));
                startActivity(cheboksari);
                break;
            case R.id.cheboksari_map:
                Intent adress_cheboksari = new Intent();
                adress_cheboksari.setAction(Intent.ACTION_VIEW);
                adress_cheboksari.setData(Uri.parse("geo:56.136482, 47.294737"));
                startActivity(adress_cheboksari);
                break;
            case (R.id.cheboksari_number2):
                Intent number2_cheboksari = new Intent(Intent.ACTION_DIAL);
                number2_cheboksari.setData(Uri.parse("tel:+7(8352) 40-59-59"));
                startActivity(number2_cheboksari);
                break;
                //chelyabinsk
            case R.id.chelyabinsk_web:
                Intent chelyabinsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.umtssplav.ru/"));
                startActivity(chelyabinsk);
                break;
            case R.id.chelyabinsk_map:
                Intent adress_chelyabinsk = new Intent();
                adress_chelyabinsk.setAction(Intent.ACTION_VIEW);
                adress_chelyabinsk.setData(Uri.parse("geo:55.194028, 61.381021"));
                startActivity(adress_chelyabinsk);
                break;
            case (R.id.chelyabinsk_number2):
                Intent number2_chelyabinsk = new Intent(Intent.ACTION_DIAL);
                number2_chelyabinsk.setData(Uri.parse("tel:+7(351)790-21-14"));
                startActivity(number2_chelyabinsk);
                break;
                //uzhno_sakhalinsk
            case R.id.uzhno_sakhalinsk_web:
                Intent uzhno_sakhalinsk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.svarkacsm.ru/"));
                startActivity(uzhno_sakhalinsk);
                break;
            case R.id.uzhno_sakhalinsk_map:
                Intent adress_uzhno_sakhalinsk = new Intent();
                adress_uzhno_sakhalinsk.setAction(Intent.ACTION_VIEW);
                adress_uzhno_sakhalinsk.setData(Uri.parse("geo:46.993512, 142.734160"));
                startActivity(adress_uzhno_sakhalinsk);
                break;
            case (R.id.uzhno_sakhalinsk_number2):
                Intent number2_uzhno_sakhalinsk = new Intent(Intent.ACTION_DIAL);
                number2_uzhno_sakhalinsk.setData(Uri.parse("tel:+7 (4242) 46-38-20"));
                startActivity(number2_uzhno_sakhalinsk);
                break;
        }
    }
}