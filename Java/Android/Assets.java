Assets listing

private boolean listAssetFiles(String path) {

    String [] list;
    try {
        list = getAssets().list(path);
        if (list.length > 0) {
            // This is a folder
            for (String file : list) {
                if (!listAssetFiles(path + "/" + file))
                    return false;
            }
        } else {
            // This is a file
            // TODO: add file name to an array list
    } catch (IOException e) {
        return false;
    }

    return true; 
} 
/*
Call the listAssetFiles with the root folder name of your asset folder.

    listAssetFiles("root_folder_name_in_assets");

If the root folder is the asset folder then call it with

    listAssetFiles(""); */   


