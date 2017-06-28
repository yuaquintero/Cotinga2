package com.sennova.cotinga;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 *  Clase encargada de construir el modelo para cada cardview que almacenara la información local de cada ave
 *
 */

public class adaptador_aves extends RecyclerView.Adapter<adaptador_aves.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nom1, nom2,nom3,nom4;
        CardView cv;
        ImageView imagen;
        String dato;
        SQLiteDatabase db;
        String[] nombreave = new String[150];
        String contador,nombres;
        Integer cuenta=0;
        String[] numero = new String[282];

        public MyViewHolder(View view) {
            super(view);
            cv = (CardView)view.findViewById(R.id.aves_cardview);
            nom1 = (TextView) view.findViewById(R.id.nombre_ave);
            nom2 = (TextView) view.findViewById(R.id.cientifico_ave);
            nom3 = (TextView) view.findViewById(R.id.ingles_ave);
            nom4 = (TextView) view.findViewById(R.id.avistamiento_ave);
            imagen=(ImageView) view.findViewById(R.id.foto_ave);
            Aves_bd Ave = new Aves_bd(view.getContext());
            db=Ave.getWritableDatabase();


            //Para los extras de cada ave
            for (int j = 0; j < 282; j ++){
                numero[j]= Integer.toString(j+1);
            }


            /**
             *  Rutina para pasar el id de cada ave seleccionada, a la actividad Ave_info.class
             *
             */
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    dato = MyViewHolder.this.getItem(nom1).toString();


                    switch (dato){
                        case "Mirlita PiquiNaranja":
                            lanzarAve(view,numero[0]);
                            break;
                        case "Cormorán Neotropical o Pato Cuervo":
                            lanzarAve(view,numero[1]);
                            break;
                        case "Garcita Bueyera":
                            lanzarAve(view,numero[2]);
                            break;
                        case "Garza Real":
                            lanzarAve(view,numero[3]);
                            break;
                        case "Garcita Estriada":
                            lanzarAve(view,numero[4]);
                            break;
                        case "Ibis Afeitado o Coquito":
                            lanzarAve(view,numero[5]);
                            break;
                        case "Barraquete Aliazul":
                            lanzarAve(view,numero[6]);
                            break;
                        case "Guala Cabecirroja":
                            lanzarAve(view,numero[7]);
                            break;
                        case "Gallinazo o Chulo":
                            lanzarAve(view,numero[8]);
                            break;
                        case "Aguila Pescadora":
                            lanzarAve(view,numero[9]);
                            break;
                        case "Gorrión Picofino":
                            lanzarAve(view,numero[10]);
                            break;
                        case "Caracolero Piquiganchudo o Selvático":
                            lanzarAve(view,numero[11]);
                            break;
                        case "Gavilán Maromero":
                            lanzarAve(view,numero[12]);
                            break;
                        case "Gavilán Enano":
                            lanzarAve(view,numero[13]);
                            break;
                        case "Gavilán Pollero":
                            lanzarAve(view,numero[14]);
                            break;
                        case "Gavilán Americano":
                            lanzarAve(view,numero[15]);
                            break;
                        case "Gavilán Aliancho":
                            lanzarAve(view,numero[16]);
                            break;
                        case "Gavilán Colicorto":
                            lanzarAve(view,numero[17]);
                            break;
                        case "Gavilán Coliblanco":
                            lanzarAve(view,numero[18]);
                            break;
                        case "Gavilán Negro":
                            lanzarAve(view,numero[19]);
                            break;
                        case "Águila Crestada De Montaña":
                            lanzarAve(view,numero[20]);
                            break;
                        case "Caracara Moñudo":
                            lanzarAve(view,numero[21]);
                            break;
                        case "Pigua":
                            lanzarAve(view,numero[22]);
                            break;
                        case "Halcón Reidor":
                            lanzarAve(view,numero[23]);
                            break;
                        case "Cernícalo americano":
                            lanzarAve(view,numero[24]);
                            break;
                        case "Guacharaca":
                            lanzarAve(view,numero[25]);
                            break;
                        case "Pava Maraquera":
                            lanzarAve(view,numero[26]);
                            break;
                        case "Rascón Negruzco o Gallineta negruzca":
                            lanzarAve(view,numero[27]);
                            break;
                        case "Caravana o Alcaraván":
                            lanzarAve(view,numero[28]);
                            break;
                        case "Agachadiza Noble o Caica De Páramo":
                            lanzarAve(view,numero[29]);
                            break;
                        case "Paloma Collareja o Torcaza":
                            lanzarAve(view,numero[30]);
                            break;
                        case "Paloma Colorada o Torcaza":
                            lanzarAve(view,numero[31]);
                            break;
                        case "Tortolita":
                            lanzarAve(view,numero[32]);
                            break;
                        case "Torcaza Caminera":
                            lanzarAve(view,numero[33]);
                            break;
                        case "Paloma Montañera Común":
                            lanzarAve(view,numero[34]);
                            break;
                        case "Cotorra Frentirroja":
                            lanzarAve(view,numero[35]);
                            break;
                        case "Loro Orejiamarillo":
                            lanzarAve(view,numero[36]);
                            break;
                        case "Periquito De Anteojos":
                            lanzarAve(view,numero[37]);
                            break;
                        case "Cotorra Gorriblanca o Carisucia":
                            lanzarAve(view,numero[38]);
                            break;
                        case "Cotorra Alibronceada o Mocha":
                            lanzarAve(view,numero[39]);
                            break;
                        case "Cuco Ardilla":
                            lanzarAve(view,numero[40]);
                            break;
                        case "Garrapatero":
                            lanzarAve(view,numero[41]);
                            break;
                        case "Lechuza Común":
                            lanzarAve(view,numero[42]);
                            break;
                        case "Currucutú":
                            lanzarAve(view,numero[43]);
                            break;
                        case "Búho Ocelado":
                            lanzarAve(view,numero[44]);
                            break;
                        case "Mochuelo Andino":
                            lanzarAve(view,numero[45]);
                            break;
                        case "Bienparado Común o Pájaro estaca":
                            lanzarAve(view,numero[46]);
                            break;
                        case "Guardacaminos Común":
                            lanzarAve(view,numero[47]);
                            break;
                        case "Guardacaminos Andino":
                            lanzarAve(view,numero[48]);
                            break;
                        case "Guardacaminos Lyra":
                            lanzarAve(view,numero[49]);
                            break;
                        case "Vencejo Acollarado":
                            lanzarAve(view,numero[50]);
                            break;
                        case "Garcita Verdosa":
                            lanzarAve(view,numero[51]);
                            break;
                        case "Ermitaño Verde":
                            lanzarAve(view,numero[52]);
                            break;
                        case "Cucarachero Chupahuevos":
                            lanzarAve(view,numero[53]);
                            break;
                        case "Colibrí Picolanza":
                            lanzarAve(view,numero[54]);
                            break;
                        case "Colibrí Verdemar":
                            lanzarAve(view,numero[55]);
                            break;
                        case "Garrapatero Mayor":
                            lanzarAve(view,numero[56]);
                            break;
                        case "Colibrí Chillón":
                            lanzarAve(view,numero[57]);
                            break;
                        case "Colibrí Pardo":
                            lanzarAve(view,numero[58]);
                            break;
                        case "Mango Pechinegro":
                            lanzarAve(view,numero[59]);
                            break;
                        case "Esmeralda Occidental":
                            lanzarAve(view,numero[60]);
                            break;
                        case "Esmeralda Andina":
                            lanzarAve(view,numero[61]);
                            break;
                        case "Amazilia Coliazul":
                            lanzarAve(view,numero[62]);
                            break;
                        case "Amazilia Colirufa":
                            lanzarAve(view,numero[63]);
                            break;
                        case "Colibrí Pechipunteado":
                            lanzarAve(view,numero[64]);
                            break;
                        case "Brillante Pechigamuza":
                            lanzarAve(view,numero[65]);
                            break;
                        case "Brillante Emperador":
                            lanzarAve(view,numero[66]);
                            break;
                        case "Halcón Murcielaguero":
                            lanzarAve(view,numero[67]);
                            break;
                        case "Colibrí Aterciopelado":
                            lanzarAve(view,numero[68]);
                            break;
                        case "Inca Bronceado":
                            lanzarAve(view,numero[69]);
                            break;
                        case "Inca Pardo":
                            lanzarAve(view,numero[70]);
                            break;
                        case "Carpintero Pechi Punteado":
                            lanzarAve(view,numero[71]);
                            break;
                        case "Inca Acollarado":
                            lanzarAve(view,numero[72]);
                            break;
                        case "Colibrí Picoespada":
                            lanzarAve(view,numero[73]);
                            break;
                        case "Colibrí Colihabano":
                            lanzarAve(view,numero[74]);
                            break;
                        case "Colibrí Sietecolores":
                            lanzarAve(view,numero[75]);
                            break;
                        case "Colibrí Turmalina":
                            lanzarAve(view,numero[76]);
                            break;
                        case "Calzadito Reluciente":
                            lanzarAve(view,numero[77]);
                            break;
                        case "Calzadito Verdoso":
                            lanzarAve(view,numero[78]);
                            break;
                        case "Colibrí Colerraqueta":
                            lanzarAve(view,numero[79]);
                            break;
                        case "Reinita Cabecigris":
                            lanzarAve(view,numero[80]);
                            break;
                        case "Metalura Colirroja":
                            lanzarAve(view,numero[81]);
                            break;
                        case "Silfo Coliverde":
                            lanzarAve(view,numero[82]);
                            break;
                        case "Silfo Colivioleta":
                            lanzarAve(view,numero[83]);
                            break;
                        case "Colibrí Piquilargo":
                            lanzarAve(view,numero[84]);
                            break;
                        case "Rumbito Gorjipúrpura":
                            lanzarAve(view,numero[85]);
                            break;
                        case "Rumbito Pechiblanco":
                            lanzarAve(view,numero[86]);
                            break;
                        case "Quetzal Colinegro o Soledad Real":
                            lanzarAve(view,numero[87]);
                            break;
                        case "Trogón Enmascarado":
                            lanzarAve(view,numero[88]);
                            break;
                        case "Martín Pescador Gigante":
                            lanzarAve(view,numero[89]);
                            break;
                        case "Guardacaminos Migratorio":
                            lanzarAve(view,numero[90]);
                            break;
                        case "Martín Pescador Verde":
                            lanzarAve(view,numero[91]);
                            break;
                        case "Barranquero":
                            lanzarAve(view,numero[92]);
                            break;
                        case "Bigotudo Canoso":
                            lanzarAve(view,numero[93]);
                            break;
                        case "Buco Cariblanco":
                            lanzarAve(view,numero[94]);
                            break;
                        case "Torito Cabecirrojo":
                            lanzarAve(view,numero[95]);
                            break;
                        case "Tucaneta Esmeralda":
                            lanzarAve(view,numero[96]);
                            break;
                        case "Tucaneta Culirroja":
                            lanzarAve(view,numero[97]);
                            break;
                        case "Paletón Pechiazul":
                            lanzarAve(view,numero[98]);
                            break;
                        case "Carpinterito Grisáceo":
                            lanzarAve(view,numero[99]);
                            break;
                        case "Carpintero Carmesí":
                            lanzarAve(view,numero[100]);
                            break;
                        case "Carpintero Oliváceo":
                            lanzarAve(view,numero[101]);
                            break;
                        case "Carpintero Real":
                            lanzarAve(view,numero[102]);
                            break;
                        case "Carpintero De Los Robles o Payaso":
                            lanzarAve(view,numero[103]);
                            break;
                        case "Carpintero Habado":
                            lanzarAve(view,numero[104]);
                            break;
                        case "Carpintero Ahumado":
                            lanzarAve(view,numero[105]);
                            break;
                        case "Carpintero Ventriamarillo":
                            lanzarAve(view,numero[106]);
                            break;
                        case "Carpintero Poderoso":
                            lanzarAve(view,numero[107]);
                            break;
                        case "Trepatroncos Tiranino":
                            lanzarAve(view,numero[108]);
                            break;
                        case "Reinita De Tennessee":
                            lanzarAve(view,numero[109]);
                            break;
                        case "Trepatroncos Cabecirrayado":
                            lanzarAve(view,numero[110]);
                            break;
                        case "Trepatroncos Montano":
                            lanzarAve(view,numero[111]);
                            break;
                        case "Picoguadaña Andino":
                            lanzarAve(view,numero[112]);
                            break;
                        case "Chamicero Piscuis":
                            lanzarAve(view,numero[113]);
                            break;
                        case "Martinete Común o Guaco Común":
                            lanzarAve(view,numero[114]);
                            break;
                        case "Chamicero Pálido":
                            lanzarAve(view,numero[115]);
                            break;
                        case "Búho Rayado":
                            lanzarAve(view,numero[116]);
                            break;
                        case "Chamicero Carirrojo":
                            lanzarAve(view,numero[117]);
                            break;
                        case "Trepatroncos Perlado":
                            lanzarAve(view,numero[118]);
                            break;
                        case "María Mulata":
                            lanzarAve(view,numero[119]);
                            break;
                        case "Trepatroncos Gorgiblanco":
                            lanzarAve(view,numero[120]);
                            break;
                        case "Hojarasquero Montañero":
                            lanzarAve(view,numero[121]);
                            break;
                        case "Hojarasquero Grande":
                            lanzarAve(view,numero[122]);
                            break;
                        case "Trepatroncos Picolezna":
                            lanzarAve(view,numero[123]);
                            break;
                        case "Tordo Llanero":
                            lanzarAve(view,numero[124]);
                            break;
                        case "Batará Carcajada":
                            lanzarAve(view,numero[125]);
                            break;
                        case "Hormiguero Tiznado":
                            lanzarAve(view,numero[126]);
                            break;
                        case "Saltador Grisáceo":
                            lanzarAve(view,numero[127]);
                            break;
                        case "Hormiguerito Rabilargo":
                            lanzarAve(view,numero[128]);
                            break;
                        case "Reinita Amarilla":
                            lanzarAve(view,numero[129]);
                            break;
                        case "Tororoí Comprapán":
                            lanzarAve(view,numero[130]);
                            break;
                        case "Tororoí Nuquicastaño":
                            lanzarAve(view,numero[131]);
                            break;
                        case "Tororoí Rufo":
                            lanzarAve(view,numero[132]);
                            break;
                        case "Totoroí Enano":
                            lanzarAve(view,numero[133]);
                            break;
                        case "Soldadito":
                            lanzarAve(view,numero[134]);
                            break;
                        case "Vireo Ojirrojo":
                            lanzarAve(view,numero[135]);
                            break;
                        case "Tapaculo Ocelado":
                            lanzarAve(view,numero[136]);
                            break;
                        case "Gallito De Roca":
                            lanzarAve(view,numero[137]);
                            break;
                        case "Cotinga Crestirroja":
                            lanzarAve(view,numero[138]);
                            break;
                        case "Cotinga Cresticastaña":
                            lanzarAve(view,numero[139]);
                            break;
                        case "Frutero Verdinegro":
                            lanzarAve(view,numero[140]);
                            break;
                        case "Frutero Barrado":
                            lanzarAve(view,numero[141]);
                            break;
                        case "Guardabosques Cenizo":
                            lanzarAve(view,numero[142]);
                            break;
                        case "Becard Barrado":
                            lanzarAve(view,numero[143]);
                            break;
                        case "Becard Aliblanco":
                            lanzarAve(view,numero[144]);
                            break;
                        case "Mosquerito Capirotado":
                            lanzarAve(view,numero[145]);
                            break;
                        case "Mosquerito Caridorado":
                            lanzarAve(view,numero[146]);
                            break;
                        case "Mosquerito Silbón":
                            lanzarAve(view,numero[147]);
                            break;
                        case "Elaenia Copetona":
                            lanzarAve(view,numero[148]);
                            break;
                        case "Elaenia Montañera":
                            lanzarAve(view,numero[149]);
                            break;
                        case "Mosquero Verdoso":
                            lanzarAve(view,numero[150]);
                            break;
                        case "Tiranuelo Gorgiblanco":
                            lanzarAve(view,numero[151]);
                            break;
                        case "Sirirí Bueyero":
                            lanzarAve(view,numero[152]);
                            break;
                        case "Tiranuelo Colilargo":
                            lanzarAve(view,numero[153]);
                            break;
                        case "Tiranuelo Saltarroyos":
                            lanzarAve(view,numero[154]);
                            break;
                        case "Atrapamoscas Sepia":
                            lanzarAve(view,numero[155]);
                            break;
                        case "Atrapamoscas Pechirrufo":
                            lanzarAve(view,numero[156]);
                            break;
                        case "Atrapamoscas Marmoreo":
                            lanzarAve(view,numero[157]);
                            break;
                        case "Atrapamoscas Variegado":
                            lanzarAve(view,numero[158]);
                            break;
                        case "Tiranuelo Coronado":
                            lanzarAve(view,numero[159]);
                            break;
                        case "Tiranuelo Cabecirrojo":
                            lanzarAve(view,numero[160]);
                            break;
                        case "Espatulita Común":
                            lanzarAve(view,numero[161]);
                            break;
                        case "Picoplano Sulfuroso":
                            lanzarAve(view,numero[162]);
                            break;
                        case "Atrapamoscas Amarillento":
                            lanzarAve(view,numero[163]);
                            break;
                        case "Atrapamoscas Pechirayado":
                            lanzarAve(view,numero[164]);
                            break;
                        case "Atrapamoscas Canela":
                            lanzarAve(view,numero[165]);
                            break;
                        case "Pibí Ahumado":
                            lanzarAve(view,numero[166]);
                            break;
                        case "Atrapamoscas Cuidapuentes":
                            lanzarAve(view,numero[167]);
                            break;
                        case "Pitajo Pechirrufo":
                            lanzarAve(view,numero[168]);
                            break;
                        case "Pitajo Torrentero":
                            lanzarAve(view,numero[169]);
                            break;
                        case "Pitajo Diademado":
                            lanzarAve(view,numero[170]);
                            break;
                        case "Atrapamoscas Chiflaperros":
                            lanzarAve(view,numero[171]);
                            break;
                        case "Atrapamoscas Tiznado":
                            lanzarAve(view,numero[172]);
                            break;
                        case "Atrapamoscas Montañero":
                            lanzarAve(view,numero[173]);
                            break;
                        case "Bichofue":
                            lanzarAve(view,numero[174]);
                            break;
                        case "Sueldita Común":
                            lanzarAve(view,numero[175]);
                            break;
                        case "Sirirí Rayado":
                            lanzarAve(view,numero[176]);
                            break;
                        case "Atrapamoscas Lagartero":
                            lanzarAve(view,numero[177]);
                            break;
                        case "Sirirí Tijereta":
                            lanzarAve(view,numero[178]);
                            break;
                        case "Sirirí Común":
                            lanzarAve(view,numero[179]);
                            break;
                        case "Golondrina Azul Y Blanca":
                            lanzarAve(view,numero[180]);
                            break;
                        case "Golondrina Gorgirrufa":
                            lanzarAve(view,numero[181]);
                            break;
                        case "Urraca Collareja":
                            lanzarAve(view,numero[182]);
                            break;
                        case "Carriqui Pechiblanco":
                            lanzarAve(view,numero[183]);
                            break;
                        case "Carriqui Ventriamarillo":
                            lanzarAve(view,numero[184]);
                            break;
                        case "Mirlita Acuática":
                            lanzarAve(view,numero[185]);
                            break;
                        case "Cucarachero Rufo":
                            lanzarAve(view,numero[186]);
                            break;
                        case "Cucarachero Sepia":
                            lanzarAve(view,numero[187]);
                            break;
                        case "Cucarachero Común":
                            lanzarAve(view,numero[188]);
                            break;
                        case "Cucarachero Montañero":
                            lanzarAve(view,numero[189]);
                            break;
                        case "Cucarachero De Munchique":
                            lanzarAve(view,numero[190]);
                            break;
                        case "Cucarachero Pechigrís":
                            lanzarAve(view,numero[191]);
                            break;
                        case "Cucarachero Bigotudo":
                            lanzarAve(view,numero[192]);
                            break;
                        case "Sinsonte":
                            lanzarAve(view,numero[193]);
                            break;
                        case "Solitario Andino o Columpio":
                            lanzarAve(view,numero[194]);
                            break;
                        case "Mirlita Buchipecosa":
                            lanzarAve(view,numero[195]);
                            break;
                        case "Mirla Patinaranja":
                            lanzarAve(view,numero[196]);
                            break;
                        case "Mirla Serrano":
                            lanzarAve(view,numero[197]);
                            break;
                        case "Mayo":
                            lanzarAve(view,numero[198]);
                            break;
                        case "Mirla Parda":
                            lanzarAve(view,numero[199]);
                            break;
                        case "Verderón Piquinegro":
                            lanzarAve(view,numero[200]);
                            break;
                        case "Vireo Coronipardo o Verderón Montañero":
                            lanzarAve(view,numero[201]);
                            break;
                        case "Chamón":
                            lanzarAve(view,numero[202]);
                            break;
                        case "Chamón Gigante":
                            lanzarAve(view,numero[203]);
                            break;
                        case "Gulungo o Mochilero":
                            lanzarAve(view,numero[204]);
                            break;
                        case "Cacique Montañero":
                            lanzarAve(view,numero[205]);
                            break;
                        case "Cacique Culirrojo":
                            lanzarAve(view,numero[206]);
                            break;
                        case "Cacique Candela":
                            lanzarAve(view,numero[207]);
                            break;
                        case "Turpial Montañero":
                            lanzarAve(view,numero[208]);
                            break;
                        case "Reinita Trepadora o Cebrita":
                            lanzarAve(view,numero[209]);
                            break;
                        case "Reinita Alidorada":
                            lanzarAve(view,numero[210]);
                            break;
                        case "Reinita Tropical":
                            lanzarAve(view,numero[211]);
                            break;
                        case "Reinita Gorginaranja":
                            lanzarAve(view,numero[212]);
                            break;
                        case "Candelita Plomiza":
                            lanzarAve(view,numero[213]);
                            break;
                        case "Candelita Adornada":
                            lanzarAve(view,numero[214]);
                            break;
                        case "Reinita Citrina":
                            lanzarAve(view,numero[215]);
                            break;
                        case "Reinita Coronirroja":
                            lanzarAve(view,numero[216]);
                            break;
                        case "Reinita Cabecirrayada":
                            lanzarAve(view,numero[217]);
                            break;
                        case "Picocono Dorsiazul":
                            lanzarAve(view,numero[218]);
                            break;
                        case "Picocono Cabeciazul":
                            lanzarAve(view,numero[219]);
                            break;
                        case "Mielerito Común":
                            lanzarAve(view,numero[220]);
                            break;
                        case "Pinchaflor Azulado":
                            lanzarAve(view,numero[221]);
                            break;
                        case "Pinchaflor Enmascarado":
                            lanzarAve(view,numero[222]);
                            break;
                        case "Pinchaflor Flanquiblanco":
                            lanzarAve(view,numero[223]);
                            break;
                        case "Mielerito Verde":
                            lanzarAve(view,numero[224]);
                            break;
                        case "Clorofonia Nuquiazul":
                            lanzarAve(view,numero[225]);
                            break;
                        case "Eufonia Cabeciazul":
                            lanzarAve(view,numero[226]);
                            break;
                        case "Eufonia Ventrinaranja":
                            lanzarAve(view,numero[227]);
                            break;
                        case "Eufonia Piquigruesa":
                            lanzarAve(view,numero[228]);
                            break;
                        case "Tángara Dorada":
                            lanzarAve(view,numero[229]);
                            break;
                        case "Tángara Coronada":
                            lanzarAve(view,numero[230]);
                            break;
                        case "Tángara Verdiplata":
                            lanzarAve(view,numero[231]);
                            break;
                        case "Tángara Real":
                            lanzarAve(view,numero[232]);
                            break;
                        case "Tángara Nuquirrufa":
                            lanzarAve(view,numero[233]);
                            break;
                        case "Tángara Cabecirroja":
                            lanzarAve(view,numero[234]);
                            break;
                        case "Tángara Rastrojera":
                            lanzarAve(view,numero[235]);
                            break;
                        case "Tángara De Lentejuelas":
                            lanzarAve(view,numero[236]);
                            break;
                        case "Tángara Azulinegra":
                            lanzarAve(view,numero[237]);
                            break;
                        case "Tángara Capirotada":
                            lanzarAve(view,numero[238]);
                            break;
                        case "Musguerito Gargantilla":
                            lanzarAve(view,numero[239]);
                            break;
                        case "Musguerito Paramuno":
                            lanzarAve(view,numero[240]);
                            break;
                        case "Tángara De Antifaz":
                            lanzarAve(view,numero[241]);
                            break;
                        case "Tángara Lacrimosa":
                            lanzarAve(view,numero[242]);
                            break;
                        case "Tángara Primavera":
                            lanzarAve(view,numero[243]);
                            break;
                        case "Azulejo Real":
                            lanzarAve(view,numero[244]);
                            break;
                        case "Tángara Diadema":
                            lanzarAve(view,numero[245]);
                            break;
                        case "Azulejo":
                            lanzarAve(view,numero[246]);
                            break;
                        case "Tángara Palmera":
                            lanzarAve(view,numero[247]);
                            break;
                        case "Tángara Coronizar":
                            lanzarAve(view,numero[248]);
                            break;
                        case "Toche Pico De plata":
                            lanzarAve(view,numero[249]);
                            break;
                        case "Toche Enjalmado":
                            lanzarAve(view,numero[250]);
                            break;
                        case "Tángara Roja":
                            lanzarAve(view,numero[251]);
                            break;
                        case "Tángara Abejera":
                            lanzarAve(view,numero[252]);
                            break;
                        case "Tángara Escarlata":
                            lanzarAve(view,numero[253]);
                            break;
                        case "Tángara Capuchirroja":
                            lanzarAve(view,numero[254]);
                            break;
                        case "Habia Copetona":
                            lanzarAve(view,numero[255]);
                            break;
                        case "Malcasado":
                            lanzarAve(view,numero[256]);
                            break;
                        case "Tiranuelo Murino":
                            lanzarAve(view,numero[257]);
                            break;
                        case "Tángara Güirá o Pintasilgo":
                            lanzarAve(view,numero[258]);
                            break;
                        case "Pollo De Monte o Rey Del Quindio":
                            lanzarAve(view,numero[259]);
                            break;
                        case "Tángara Piquirroja":
                            lanzarAve(view,numero[260]);
                            break;
                        case "Hemispingo Capirotado":
                            lanzarAve(view,numero[261]);
                            break;
                        case "Tangara Lorito":
                            lanzarAve(view,numero[262]);
                            break;
                        case "Gorrion Afelpado":
                            lanzarAve(view,numero[263]);
                            break;
                        case "Saltador Ajicero":
                            lanzarAve(view,numero[264]);
                            break;
                        case "Saltador Alinegro":
                            lanzarAve(view,numero[265]);
                            break;
                        case "Saltador Pio Judio":
                            lanzarAve(view,numero[266]);
                            break;
                        case "Picogordo Degollado":
                            lanzarAve(view,numero[267]);
                            break;
                        case "Gorrión Tangarino":
                            lanzarAve(view,numero[268]);
                            break;
                        case "Atlapetes Gorgiamarillo":
                            lanzarAve(view,numero[269]);
                            break;
                        case "Gorrión Montés Pizarra":
                            lanzarAve(view,numero[270]);
                            break;
                        case "Gorrión Montés Collarejo":
                            lanzarAve(view,numero[271]);
                            break;
                        case "Semillero Cariamarillo":
                            lanzarAve(view,numero[272]);
                            break;
                        case "Semillero Intermedio":
                            lanzarAve(view,numero[273]);
                            break;
                        case "Semillero Negriblanco":
                            lanzarAve(view,numero[274]);
                            break;
                        case "Semillero Capuchino":
                            lanzarAve(view,numero[275]);
                            break;
                        case "Semillero Volatinero":
                            lanzarAve(view,numero[276]);
                            break;
                        case "Copetoncito, Pinche o Afrechero":
                            lanzarAve(view,numero[277]);
                            break;
                        case "Botón de Oro o Canario Costeño":
                            lanzarAve(view,numero[278]);
                            break;
                        case "Jilguero Ventriamarillo":
                            lanzarAve(view,numero[279]);
                            break;
                        case "Jilguero Aliblanco":
                            lanzarAve(view,numero[280]);
                            break;
                        case "Paloma Común":
                            lanzarAve(view,numero[281]);
                            break;
                    }




                    /*}else if(dato.equals(nombreave[289])){
                        lanzarAve(view,numero[289]);
                    }*/
                }

            });

        }
        /**
         * Método para obtener el nombre comun del ave del cardview
         * @return Nombre en español del ave seleccionada
         *
         */
        private CharSequence getItem(TextView nom1) {
            return nom1.getText();
        }
    }
    /**
     * Construcción de la lista de aves
     *
     */
    List<Ave_constructor> lista_aves;
    adaptador_aves(List<Ave_constructor> lista_aves) {

        this.lista_aves = lista_aves;
    }
    /**
     * Método que establece la relación con el recyclerview
     *
     */
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    /**
     * Método para obtener el recurso grafico a desplegar en el cardview
     *
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.aves_card, parent, false);
        return new MyViewHolder(itemView);
    }
    /**
     * Método para armar el cardview de aves con base en la información capturada de la base de datos local
     *
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int i) {

        holder.nom1.setText(lista_aves.get(i).nombre1);
        holder.nom2.setText(lista_aves.get(i).nombre2);
        holder.nom3.setText(lista_aves.get(i).nombre3);
        holder.nom4.setText(lista_aves.get(i).nombre4);
        holder.imagen.setImageResource(lista_aves.get(i).id);

    }

    @Override
    public int getItemCount() {

        return lista_aves.size();
    }


    public void lanzarAve(View view, String n){
        Intent intent= new Intent (view.getContext(), Ave_info.class);
        intent.putExtra("id",n);
        view.getContext().startActivity(intent);
    }
}



