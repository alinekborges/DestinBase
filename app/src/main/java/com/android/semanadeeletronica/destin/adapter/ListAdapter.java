package com.android.semanadeeletronica.destin.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.semanadeeletronica.destin.R;

import java.util.List;

/**
 * Created by Aline Borges on 11/9/2014.
 *
 * Template para List Adapter personalizado
 * Como utilizar:
 * ** Substitua "Object" pelo seu objeto a ser impresso
 * ** Prepare o ViewHolder de acordo com o seu item layout
 * **
 */
public class ListAdapter extends BaseAdapter {

    private final LayoutInflater inflater; //responsável por "Inflar" os itens da lista
    private List<Object> list; //Lista de objetos da lista
    private Activity context;  //contexto
    private String TAG = "List Adapter"; //Tag

    /**
        Construtor do Adapter
    @param context Contexto da Lista
    @param list Lista de objetos que serão impressos
     */
    public ListAdapter(Activity context, List<Object> list) {
        this.inflater = LayoutInflater.from(context); //inicializa o "inflater"
        this.list = list;
        this.context = context;
    }

    /**
     * Método obrigatório
     * @return número de objetos na lista a ser impresso
     */
    @Override
    public int getCount() {
        return list.size();
    }

    /**
     * Método obrigatório
     * @param position posição
     * @return Objeto relacionado à posição
     */
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    /**
     * Método obrigatório
     * @param position
     * @return o ID do Objeto daquela posição (neste caso, a própria posição)
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * Método obrigatório que irá retornar a View do item da lista
     * Essa view já está com os items do objeto impressos corretamente
     * @param position
     * @param convertView
     * @param parent
     * @return View do item da lista
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            //convertView = inflater.inflate(R.layout.item_list_activity, null);
            holder = getViewHolder(convertView);
            convertView.setTag(holder);
        }

        holder = (ViewHolder) convertView.getTag();

        Object object = this.getItem(position);

        printObject(object, holder);

        return convertView;
    }

    /**
     * Método para imprimir o objeto nos campos correspondentes
     * @param object
     * @param holder
     */
    private void printObject(Object object, ViewHolder holder) {

        //holder.txtTitle.setText(object.getTitle());

    }

    /**
     * Método para criar o holder
     * @param convertView
     * @return view holder
     */
    private ViewHolder getViewHolder(View convertView) {

        ViewHolder holder = new ViewHolder(); //instancia um novo ViewHolder

        //holder.txtTitle   = (TextView) convertView.findViewById(R.id.txtTitle);

        return holder;
    }


    /**
     * ViewHolder
     * Guarda todos os items de View que fazem parte do item layout
     */
    private static class ViewHolder {
        //insira aqui os campos
        protected TextView txtTitle;
    }

}
