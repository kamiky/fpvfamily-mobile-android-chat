package com.nativemessagelist;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

class MessageListManager extends SimpleViewManager<RecyclerView> {

  private ThemedReactContext reactContext;

  @NonNull
  @Override
  public String getName() {
    return "MessageList";
  }

  @NonNull
  @Override
  protected RecyclerView createViewInstance(@NonNull ThemedReactContext reactContext) {
    this.reactContext = reactContext;
    RecyclerView recyclerView = new RecyclerView(reactContext);
    return recyclerView;
  }

  @ReactProp(name = "scrollEnabled")
  public void setScrollMode(RecyclerView recyclerView, boolean isScrollEnabled) {

    LinearLayoutManager mLayoutManager = new LinearLayoutManager(recyclerView.getContext()) {
      @Override
      public boolean canScrollVertically() {
        return isScrollEnabled;
      }
    };
    recyclerView.setLayoutManager(mLayoutManager);
  }

 /* @ReactProp(name = "getScrollEnabled")
  public boolean getScrollMode(RecyclerView recyclerView) {
    LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
    RecyclerView.Adapter adapter = recyclerView.getAdapter();
    if (layoutManager == null || adapter == null) return false;

    return layoutManager.findLastCompletelyVisibleItemPosition() < adapter.getItemCount() - 1;
  }*/


  @ReactProp(name = "listing")
  public void setList(RecyclerView recyclerView, String stringArrayJson) {
    try {
      Gson gson = new Gson();
      Type listType = new TypeToken<List<Movies>>() {
      }.getType();
      List<Movies> moviesList = gson.fromJson(stringArrayJson, listType);

      MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(reactContext, moviesList);
      recyclerView.setAdapter(myRecyclerViewAdapter);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
